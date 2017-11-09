/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CorporateActionCashEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action movement option
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmPlaceAndName
 * OptionTransactionDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentification
 * OptionTransactionDetailsSD2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionSequenceNumber
 * OptionTransactionDetailsSD2.mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationDate
 * OptionTransactionDetailsSD2.mmTransactionIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationQuantity
 * OptionTransactionDetailsSD2.mmTransactionIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationOversubscriptionQuantity
 * OptionTransactionDetailsSD2.
 * mmTransactionIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmAcceptedQuantity
 * OptionTransactionDetailsSD2.mmAcceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmUnacceptedQuantity
 * OptionTransactionDetailsSD2.mmUnacceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledAmount
 * OptionTransactionDetailsSD2.mmEntitledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledQuantity
 * OptionTransactionDetailsSD2.mmEntitledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledOversubscriptionQuantity
 * OptionTransactionDetailsSD2.mmEntitledOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmRefundedOversubscriptionAmount
 * OptionTransactionDetailsSD2.mmRefundedOversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmSubscriptionAmount
 * OptionTransactionDetailsSD2.mmSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmOversubscriptionAmount
 * OptionTransactionDetailsSD2.mmOversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmFinalSubscriptionAdjustmentAmount
 * OptionTransactionDetailsSD2.mmFinalSubscriptionAdjustmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmCashInLieuOfShare
 * OptionTransactionDetailsSD2.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmCustomerReferenceIdentification
 * OptionTransactionDetailsSD2.mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmAgentEnteredQuantity
 * OptionTransactionDetailsSD2.mmAgentEnteredQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionTransactionDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement option details."
 * </li>
 * </ul>
 */
public class OptionTransactionDetailsSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max15Text transactionIdentification;
	/**
	 * Unique number assigned by the Depository. Transaction identification will
	 * be either the DTC Instruction Reference Number for reorganisation
	 * instructions (VOI) or the DAM Reference Number for custody /
	 * reorganisation deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number assigned by the Depository.  Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the Depository.  Transaction identification will be either the DTC Instruction Reference Number for reorganisation instructions (VOI) or the DAM Reference Number for custody / reorganisation deposits. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	protected Max3NumericText transactionSequenceNumber;
	/**
	 * Number which further identifies DTC intsruction reference number. Not
	 * applicable to reorganisation / custody deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number which further identifies DTC intsruction reference number.  Not applicable to reorganisation / custody deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC intsruction reference number.  Not applicable to reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected ISODateTime transactionIdentificationDate;
	/**
	 * Instruction date and time for reorganisation instructions or the deposit
	 * date for reorganisation / custody deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDate";
			definition = "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionIdentificationQuantity;
	/**
	 * Instructed quantity for reorganisation instructions or the deposit
	 * quantity for reorganisation / custody deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationQuantity";
			definition = "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity;
	/**
	 * Oversubscribed quantity of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Oversubscribed quantity of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationOversubscriptionQuantity";
			definition = "Oversubscribed quantity of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice acceptedQuantity;
	/**
	 * For prorated events, portion of the instructed units that was accepted by
	 * the Issuer / Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For prorated events, portion of the instructed units that was accepted by the Issuer / Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "AccptdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedQuantity";
			definition = "For prorated events, portion of the instructed units that was accepted by the Issuer / Agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice unacceptedQuantity;
	/**
	 * For prorated events, the portion of the instructed quantity that was not
	 * accepted by the Issuer / Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UaccptdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For prorated events, the portion of the instructed quantity that was not accepted by the Issuer / Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnacceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "UaccptdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedQuantity";
			definition = "For prorated events, the portion of the instructed quantity that was not accepted by the Issuer / Agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount entitledAmount;
	/**
	 * Amount based upon the DTC cash rate per instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount based upon the DTC cash rate per instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitledAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "EntitldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledAmount";
			definition = "Amount based upon the DTC cash rate per instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice entitledQuantity;
	/**
	 * Quantity based upon the DTC security rate per instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity based upon the DTC security rate per instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntitledQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "EntitldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledQuantity";
			definition = "Quantity based upon the DTC security rate per instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice entitledOversubscriptionQuantity;
	/**
	 * Entitled units for the oversubscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitled units for the oversubscription."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntitledOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "EntitldOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledOversubscriptionQuantity";
			definition = "Entitled units for the oversubscription.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount refundedOversubscriptionAmount;
	/**
	 * Amount to be refunded for oversubscribed shares not accepted by the
	 * issuer / agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfnddOvrsbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedOversubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be refunded for oversubscribed shares not accepted by the issuer / agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRefundedOversubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "RfnddOvrsbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedOversubscriptionAmount";
			definition = "Amount to be refunded for oversubscribed shares not accepted by the issuer / agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount subscriptionAmount;
	/**
	 * Amount paid to the issuer / agent for subscription cost.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount paid to the issuer / agent for subscription cost."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "SbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionAmount";
			definition = "Amount paid to the issuer / agent for subscription cost.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount oversubscriptionAmount;
	/**
	 * Amount paid to the issuer / agent for the oversubscription cost.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount paid to the issuer / agent for the oversubscription cost."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOversubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionAmount";
			definition = "Amount paid to the issuer / agent for the oversubscription cost.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount finalSubscriptionAdjustmentAmount;
	/**
	 * Adjustment related to the difference between the estimated and final
	 * price for the subscription cost.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSbcptAdjstmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSubscriptionAdjustmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment related to the difference between the estimated and final price for the subscription cost. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalSubscriptionAdjustmentAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "FnlSbcptAdjstmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSubscriptionAdjustmentAmount";
			definition = "Adjustment related to the difference between the estimated and final price for the subscription cost. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * Cash disbursement in lieu of a fractional quantity of, for example,
	 * equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max15Text customerReferenceIdentification;
	/**
	 * Customer identification entered by client upon instruction submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice agentEnteredQuantity;
	/**
	 * Quantity entered by the Agent on PUT (Mortgage Backed) instructions to be
	 * paid. This quantity can be for the full or partial instructed quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
	 * OptionTransactionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtNtrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentEnteredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity entered by the Agent on PUT (Mortgage Backed) instructions to be paid. This quantity can be for the full or partial instructed quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAgentEnteredQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtNtrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentEnteredQuantity";
			definition = "Quantity entered by the Agent on PUT (Mortgage Backed) instructions to be paid. This quantity can be for the full or partial instructed quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OptionTransactionDetailsSD2.mmPlaceAndName, OptionTransactionDetailsSD2.mmTransactionIdentification, OptionTransactionDetailsSD2.mmTransactionSequenceNumber,
						OptionTransactionDetailsSD2.mmTransactionIdentificationDate, OptionTransactionDetailsSD2.mmTransactionIdentificationQuantity, OptionTransactionDetailsSD2.mmTransactionIdentificationOversubscriptionQuantity,
						OptionTransactionDetailsSD2.mmAcceptedQuantity, OptionTransactionDetailsSD2.mmUnacceptedQuantity, OptionTransactionDetailsSD2.mmEntitledAmount, OptionTransactionDetailsSD2.mmEntitledQuantity,
						OptionTransactionDetailsSD2.mmEntitledOversubscriptionQuantity, OptionTransactionDetailsSD2.mmRefundedOversubscriptionAmount, OptionTransactionDetailsSD2.mmSubscriptionAmount,
						OptionTransactionDetailsSD2.mmOversubscriptionAmount, OptionTransactionDetailsSD2.mmFinalSubscriptionAdjustmentAmount, OptionTransactionDetailsSD2.mmCashInLieuOfShare,
						OptionTransactionDetailsSD2.mmCustomerReferenceIdentification, OptionTransactionDetailsSD2.mmAgentEnteredQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OptionTransactionDetailsSD2";
				definition = "Provides additional information regarding corporate action movement option details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public Max15Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max3NumericText getTransactionSequenceNumber() {
		return transactionSequenceNumber;
	}

	public void setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
	}

	public ISODateTime getTransactionIdentificationDate() {
		return transactionIdentificationDate;
	}

	public void setTransactionIdentificationDate(ISODateTime transactionIdentificationDate) {
		this.transactionIdentificationDate = transactionIdentificationDate;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationQuantity() {
		return transactionIdentificationQuantity;
	}

	public void setTransactionIdentificationQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationQuantity) {
		this.transactionIdentificationQuantity = transactionIdentificationQuantity;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationOversubscriptionQuantity() {
		return transactionIdentificationOversubscriptionQuantity;
	}

	public void setTransactionIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity) {
		this.transactionIdentificationOversubscriptionQuantity = transactionIdentificationOversubscriptionQuantity;
	}

	public FinancialInstrumentQuantity15Choice getAcceptedQuantity() {
		return acceptedQuantity;
	}

	public void setAcceptedQuantity(FinancialInstrumentQuantity15Choice acceptedQuantity) {
		this.acceptedQuantity = acceptedQuantity;
	}

	public FinancialInstrumentQuantity15Choice getUnacceptedQuantity() {
		return unacceptedQuantity;
	}

	public void setUnacceptedQuantity(FinancialInstrumentQuantity15Choice unacceptedQuantity) {
		this.unacceptedQuantity = unacceptedQuantity;
	}

	public RestrictedFINActiveCurrencyAndAmount getEntitledAmount() {
		return entitledAmount;
	}

	public void setEntitledAmount(RestrictedFINActiveCurrencyAndAmount entitledAmount) {
		this.entitledAmount = entitledAmount;
	}

	public FinancialInstrumentQuantity15Choice getEntitledQuantity() {
		return entitledQuantity;
	}

	public void setEntitledQuantity(FinancialInstrumentQuantity15Choice entitledQuantity) {
		this.entitledQuantity = entitledQuantity;
	}

	public FinancialInstrumentQuantity15Choice getEntitledOversubscriptionQuantity() {
		return entitledOversubscriptionQuantity;
	}

	public void setEntitledOversubscriptionQuantity(FinancialInstrumentQuantity15Choice entitledOversubscriptionQuantity) {
		this.entitledOversubscriptionQuantity = entitledOversubscriptionQuantity;
	}

	public RestrictedFINActiveCurrencyAndAmount getRefundedOversubscriptionAmount() {
		return refundedOversubscriptionAmount;
	}

	public void setRefundedOversubscriptionAmount(RestrictedFINActiveCurrencyAndAmount refundedOversubscriptionAmount) {
		this.refundedOversubscriptionAmount = refundedOversubscriptionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getSubscriptionAmount() {
		return subscriptionAmount;
	}

	public void setSubscriptionAmount(RestrictedFINActiveCurrencyAndAmount subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getOversubscriptionAmount() {
		return oversubscriptionAmount;
	}

	public void setOversubscriptionAmount(RestrictedFINActiveCurrencyAndAmount oversubscriptionAmount) {
		this.oversubscriptionAmount = oversubscriptionAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getFinalSubscriptionAdjustmentAmount() {
		return finalSubscriptionAdjustmentAmount;
	}

	public void setFinalSubscriptionAdjustmentAmount(RestrictedFINActiveCurrencyAndAmount finalSubscriptionAdjustmentAmount) {
		this.finalSubscriptionAdjustmentAmount = finalSubscriptionAdjustmentAmount;
	}

	public RestrictedFINActiveCurrencyAndAmount getCashInLieuOfShare() {
		return cashInLieuOfShare;
	}

	public void setCashInLieuOfShare(RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
	}

	public Max15Text getCustomerReferenceIdentification() {
		return customerReferenceIdentification;
	}

	public void setCustomerReferenceIdentification(Max15Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
	}

	public FinancialInstrumentQuantity15Choice getAgentEnteredQuantity() {
		return agentEnteredQuantity;
	}

	public void setAgentEnteredQuantity(FinancialInstrumentQuantity15Choice agentEnteredQuantity) {
		this.agentEnteredQuantity = agentEnteredQuantity;
	}
}