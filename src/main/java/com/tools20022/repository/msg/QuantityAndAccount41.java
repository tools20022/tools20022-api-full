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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06;
import com.tools20022.repository.choice.CashAccountIdentification5Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.Quantity6Choice;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details on the quantity, account and other related information involved in a
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSettledQuantity
 * QuantityAndAccount41.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledQuantity
 * QuantityAndAccount41.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledQuantity
 * QuantityAndAccount41.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmPreviouslySettledAmount
 * QuantityAndAccount41.mmPreviouslySettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmRemainingToBeSettledAmount
 * QuantityAndAccount41.mmRemainingToBeSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmDenominationChoice
 * QuantityAndAccount41.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmAccountOwner
 * QuantityAndAccount41.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSafekeepingAccount
 * QuantityAndAccount41.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmCashAccount
 * QuantityAndAccount41.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmQuantityBreakdown
 * QuantityAndAccount41.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSafekeepingPlace
 * QuantityAndAccount41.mmSafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionConfirmationV06.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionReversalAdviceV05.mmQuantityAndAccountDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionConfirmationV07.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionReversalAdviceV06.mmQuantityAndAccountDetails}
 * </li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityAndAccount41"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details on the quantity, account and other related information involved in a transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
 * QuantityAndAccount28}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuantityAndAccount41", propOrder = {"settledQuantity", "previouslySettledQuantity", "remainingToBeSettledQuantity", "previouslySettledAmount", "remainingToBeSettledAmount", "denominationChoice", "accountOwner",
		"safekeepingAccount", "cashAccount", "quantityBreakdown", "safekeepingPlace"})
public class QuantityAndAccount41 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Quantity6Choice settledQuantity;
	/**
	 * Quantity of financial instrument effectively settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSettledQuantity
	 * QuantityAndAccount28.mmSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmSettledQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice previouslySettledQuantity;
	/**
	 * Quantity of financial instrument previously settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmPreviouslySettledQuantity
	 * QuantityAndAccount28.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviouslySettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmPreviouslySettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity;
	/**
	 * Quantity of financial instrument remaining to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument remaining to be settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount28.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemainingToBeSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmRemainingToBeSettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected AmountAndDirection52 previouslySettledAmount;
	/**
	 * Amount of money previously settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection52
	 * AmountAndDirection52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmPreviouslySettledAmount
	 * QuantityAndAccount28.mmPreviouslySettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviouslySettledAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledAmount";
			definition = "Amount of money previously settled.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmPreviouslySettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection52.mmObject();
		}
	};
	protected AmountAndDirection52 remainingToBeSettledAmount;
	/**
	 * Amount of money remaining to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection52
	 * AmountAndDirection52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remaining to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmRemainingToBeSettledAmount
	 * QuantityAndAccount28.mmRemainingToBeSettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemainingToBeSettledAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledAmount";
			definition = "Amount of money remaining to be settled.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmRemainingToBeSettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection52.mmObject();
		}
	};
	protected Max210Text denominationChoice;
	/**
	 * Denomination of the security to be received or delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
	 * SecuritiesSettlement.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denomination of the security to be received or delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmDenominationChoice
	 * QuantityAndAccount28.mmDenominationChoice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationChoice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmDenominationChoice;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "DnmtnChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination of the security to be received or delivered.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmDenominationChoice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};
	protected PartyIdentification98 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmAccountOwner
	 * QuantityAndAccount28.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification98.mmObject();
		}
	};
	protected SecuritiesAccount24 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount24
	 * SecuritiesAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSafekeepingAccount
	 * QuantityAndAccount28.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount24.mmObject();
		}
	};
	protected CashAccountIdentification5Choice cashAccount;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmCashAccount
	 * QuantityAndAccount28.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuantityBreakdown29> quantityBreakdown;
	/**
	 * Breakdown of a quantity into lots such as tax lots, instrument series,
	 * etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown29
	 * QuantityBreakdown29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of a quantity into lots such as tax lots, instrument series, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmQuantityBreakdown
	 * QuantityAndAccount28.mmQuantityBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series, etc.";
			previousVersion_lazy = () -> QuantityAndAccount28.mmQuantityBreakdown;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown29.mmObject();
		}
	};
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSafekeepingPlace
	 * QuantityAndAccount28.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> QuantityAndAccount41.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> QuantityAndAccount28.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuantityAndAccount41.mmSettledQuantity, QuantityAndAccount41.mmPreviouslySettledQuantity, QuantityAndAccount41.mmRemainingToBeSettledQuantity,
						QuantityAndAccount41.mmPreviouslySettledAmount, QuantityAndAccount41.mmRemainingToBeSettledAmount, QuantityAndAccount41.mmDenominationChoice, QuantityAndAccount41.mmAccountOwner,
						QuantityAndAccount41.mmSafekeepingAccount, QuantityAndAccount41.mmCashAccount, QuantityAndAccount41.mmQuantityBreakdown, QuantityAndAccount41.mmSafekeepingPlace);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV06.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionReversalAdviceV05.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionConfirmationV07.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionReversalAdviceV06.mmQuantityAndAccountDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityAndAccount41";
				definition = "Details on the quantity, account and other related information involved in a transaction.";
				previousVersion_lazy = () -> QuantityAndAccount28.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttldQty", required = true)
	public Quantity6Choice getSettledQuantity() {
		return settledQuantity;
	}

	public void setSettledQuantity(Quantity6Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
	}

	@XmlElement(name = "PrevslySttldQty")
	public FinancialInstrumentQuantity1Choice getPreviouslySettledQuantity() {
		return previouslySettledQuantity;
	}

	public void setPreviouslySettledQuantity(FinancialInstrumentQuantity1Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
	}

	@XmlElement(name = "RmngToBeSttldQty")
	public FinancialInstrumentQuantity1Choice getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity;
	}

	public void setRemainingToBeSettledQuantity(FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
	}

	@XmlElement(name = "PrevslySttldAmt")
	public AmountAndDirection52 getPreviouslySettledAmount() {
		return previouslySettledAmount;
	}

	public void setPreviouslySettledAmount(com.tools20022.repository.msg.AmountAndDirection52 previouslySettledAmount) {
		this.previouslySettledAmount = previouslySettledAmount;
	}

	@XmlElement(name = "RmngToBeSttldAmt")
	public AmountAndDirection52 getRemainingToBeSettledAmount() {
		return remainingToBeSettledAmount;
	}

	public void setRemainingToBeSettledAmount(com.tools20022.repository.msg.AmountAndDirection52 remainingToBeSettledAmount) {
		this.remainingToBeSettledAmount = remainingToBeSettledAmount;
	}

	@XmlElement(name = "DnmtnChc")
	public Max210Text getDenominationChoice() {
		return denominationChoice;
	}

	public void setDenominationChoice(Max210Text denominationChoice) {
		this.denominationChoice = denominationChoice;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification98 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount24 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount24 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "CshAcct")
	public CashAccountIdentification5Choice getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(CashAccountIdentification5Choice cashAccount) {
		this.cashAccount = cashAccount;
	}

	@XmlElement(name = "QtyBrkdwn")
	public List<QuantityBreakdown29> getQuantityBreakdown() {
		return quantityBreakdown;
	}

	public void setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown29> quantityBreakdown) {
		this.quantityBreakdown = quantityBreakdown;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafeKeepingPlace1 getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(com.tools20022.repository.msg.SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}
}