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
import com.tools20022.repository.area.sese.TransferInInstructionV08;
import com.tools20022.repository.codeset.PhysicalTransferType1Code;
import com.tools20022.repository.codeset.StampDutyType2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmTransferor
 * DeliverInformation19.mmTransferor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmTransferorRegisteredAccount
 * DeliverInformation19.mmTransferorRegisteredAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmIntermediaryInformation
 * DeliverInformation19.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmRequestedSettlementDate
 * DeliverInformation19.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementAmount
 * DeliverInformation19.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmStampDuty
 * DeliverInformation19.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmNetAmount
 * DeliverInformation19.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation19#mmFees
 * DeliverInformation19.mmFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmIndividualTax
 * DeliverInformation19.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmForeignExchangeDetails
 * DeliverInformation19.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmSettlementPartiesDetails
 * DeliverInformation19.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmPhysicalTransfer
 * DeliverInformation19.mmPhysicalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmPhysicalTransferDetails
 * DeliverInformation19.mmPhysicalTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmClientReference
 * DeliverInformation19.mmClientReference}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmSettlementDetails
 * TransferInInstructionV08.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation19
 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation19
 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation19
 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation19}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliverInformation19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16
 * DeliverInformation16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliverInformation19", propOrder = {"transferor", "transferorRegisteredAccount", "intermediaryInformation", "requestedSettlementDate", "settlementAmount", "stampDuty", "netAmount", "fees", "individualTax",
		"foreignExchangeDetails", "settlementPartiesDetails", "physicalTransfer", "physicalTransferDetails", "clientReference"})
public class DeliverInformation19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Trfr")
	protected PartyIdentification113 transferor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transferor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers (transferor) securities to the receiving agent (transferee)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmTransferor
	 * DeliverInformation16.mmTransferor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, Optional<PartyIdentification113>> mmTransferor = new MMMessageAssociationEnd<DeliverInformation19, Optional<PartyIdentification113>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "Trfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferor";
			definition = "Party that delivers (transferor) securities to the receiving agent (transferee).";
			previousVersion_lazy = () -> DeliverInformation16.mmTransferor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(DeliverInformation19 obj) {
			return obj.getTransferor();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<PartyIdentification113> value) {
			obj.setTransferor(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfrRegdAcct")
	protected Account24 transferorRegisteredAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account24 Account24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrRegdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferorRegisteredAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from which the securities are to be delivered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmTransferorRegisteredAccount
	 * DeliverInformation16.mmTransferorRegisteredAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, Optional<Account24>> mmTransferorRegisteredAccount = new MMMessageAssociationEnd<DeliverInformation19, Optional<Account24>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "TrfrRegdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorRegisteredAccount";
			definition = "Account from which the securities are to be delivered.";
			previousVersion_lazy = () -> DeliverInformation16.mmTransferorRegisteredAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account24.mmObject();
		}

		@Override
		public Optional<Account24> getValue(DeliverInformation19 obj) {
			return obj.getTransferorRegisteredAccount();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<Account24> value) {
			obj.setTransferorRegisteredAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<Intermediary41> intermediaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary41
	 * Intermediary41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related party or intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmIntermediaryInformation
	 * DeliverInformation16.mmIntermediaryInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, List<Intermediary41>> mmIntermediaryInformation = new MMMessageAssociationEnd<DeliverInformation19, List<Intermediary41>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Identification of a related party or intermediary.";
			previousVersion_lazy = () -> DeliverInformation16.mmIntermediaryInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary41.mmObject();
		}

		@Override
		public List<Intermediary41> getValue(DeliverInformation19 obj) {
			return obj.getIntermediaryInformation();
		}

		@Override
		public void setValue(DeliverInformation19 obj, List<Intermediary41> value) {
			obj.setIntermediaryInformation(value);
		}
	};
	@XmlElement(name = "ReqdSttlmDt")
	protected ISODate requestedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmRequestedSettlementDate
	 * DeliverInformation16.mmRequestedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliverInformation19, Optional<ISODate>> mmRequestedSettlementDate = new MMMessageAttribute<DeliverInformation19, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			previousVersion_lazy = () -> DeliverInformation16.mmRequestedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DeliverInformation19 obj) {
			return obj.getRequestedSettlementDate();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<ISODate> value) {
			obj.setRequestedSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid/to be paid or received in exchange for the financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementAmount
	 * DeliverInformation16.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliverInformation19, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<DeliverInformation19, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid/to be paid or received in exchange for the financial instrument.";
			previousVersion_lazy = () -> DeliverInformation16.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(DeliverInformation19 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDty")
	protected StampDutyType2Code stampDuty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType2Code
	 * StampDutyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyType
	 * SecuritiesTax.mmStampDutyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the settlement amount includes the stamp duty amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmStampDuty
	 * DeliverInformation16.mmStampDuty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliverInformation19, Optional<StampDutyType2Code>> mmStampDuty = new MMMessageAttribute<DeliverInformation19, Optional<StampDutyType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Specifies if the settlement amount includes the stamp duty amount.";
			previousVersion_lazy = () -> DeliverInformation16.mmStampDuty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StampDutyType2Code.mmObject();
		}

		@Override
		public Optional<StampDutyType2Code> getValue(DeliverInformation19 obj) {
			return obj.getStampDuty();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<StampDutyType2Code> value) {
			obj.setStampDuty(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAmt")
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmNetAmount
	 * DeliverInformation16.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliverInformation19, Optional<ActiveCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<DeliverInformation19, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Deal amount.";
			previousVersion_lazy = () -> DeliverInformation16.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(DeliverInformation19 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Fees")
	protected List<Fees1> fees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fees1 Fees1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fee related to the transfer of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, List<Fees1>> mmFees = new MMMessageAssociationEnd<DeliverInformation19, List<Fees1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Fee related to the transfer of the financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Fees1.mmObject();
		}

		@Override
		public List<Fees1> getValue(DeliverInformation19 obj) {
			return obj.getFees();
		}

		@Override
		public void setValue(DeliverInformation19 obj, List<Fees1> value) {
			obj.setFees(value);
		}
	};
	@XmlElement(name = "IndvTax")
	protected List<Tax34> individualTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax34 Tax34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, List<Tax34>> mmIndividualTax = new MMMessageAssociationEnd<DeliverInformation19, List<Tax34>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "IndvTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTax";
			definition = "Tax related to the transfer of the financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax34.mmObject();
		}

		@Override
		public List<Tax34> getValue(DeliverInformation19 obj) {
			return obj.getIndividualTax();
		}

		@Override
		public void setValue(DeliverInformation19 obj, List<Tax34> value) {
			obj.setIndividualTax(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms33> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
	 * ForeignExchangeTerms33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmForeignExchangeDetails
	 * DeliverInformation16.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, List<ForeignExchangeTerms33>> mmForeignExchangeDetails = new MMMessageAssociationEnd<DeliverInformation19, List<ForeignExchangeTerms33>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769.";
			previousVersion_lazy = () -> DeliverInformation16.mmForeignExchangeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms33.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms33> getValue(DeliverInformation19 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(DeliverInformation19 obj, List<ForeignExchangeTerms33> value) {
			obj.setForeignExchangeDetails(value);
		}
	};
	@XmlElement(name = "SttlmPtiesDtls")
	protected DeliveringPartiesAndAccount17 settlementPartiesDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmSettlementPartiesDetails
	 * DeliverInformation16.mmSettlementPartiesDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, Optional<DeliveringPartiesAndAccount17>> mmSettlementPartiesDetails = new MMMessageAssociationEnd<DeliverInformation19, Optional<DeliveringPartiesAndAccount17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesDetails";
			definition = "Chain of parties involved in the settlement of a transaction.";
			previousVersion_lazy = () -> DeliverInformation16.mmSettlementPartiesDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveringPartiesAndAccount17.mmObject();
		}

		@Override
		public Optional<DeliveringPartiesAndAccount17> getValue(DeliverInformation19 obj) {
			return obj.getSettlementPartiesDetails();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<DeliveringPartiesAndAccount17> value) {
			obj.setSettlementPartiesDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysTrf")
	protected PhysicalTransferType1Code physicalTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType1Code
	 * PhysicalTransferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmType
	 * PhysicalDelivery.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmPhysicalTransfer
	 * DeliverInformation16.mmPhysicalTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliverInformation19, Optional<PhysicalTransferType1Code>> mmPhysicalTransfer = new MMMessageAttribute<DeliverInformation19, Optional<PhysicalTransferType1Code>>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "PhysTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransfer";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			previousVersion_lazy = () -> DeliverInformation16.mmPhysicalTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType1Code.mmObject();
		}

		@Override
		public Optional<PhysicalTransferType1Code> getValue(DeliverInformation19 obj) {
			return obj.getPhysicalTransfer();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<PhysicalTransferType1Code> value) {
			obj.setPhysicalTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysTrfDtls")
	protected DeliveryParameters4 physicalTransferDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of a physical delivery."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmPhysicalTransferDetails
	 * DeliverInformation16.mmPhysicalTransferDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, Optional<DeliveryParameters4>> mmPhysicalTransferDetails = new MMMessageAssociationEnd<DeliverInformation19, Optional<DeliveryParameters4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "PhysTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetails";
			definition = "Parameters of a physical delivery.";
			previousVersion_lazy = () -> DeliverInformation16.mmPhysicalTransferDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters4.mmObject();
		}

		@Override
		public Optional<DeliveryParameters4> getValue(DeliverInformation19 obj) {
			return obj.getPhysicalTransferDetails();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<DeliveryParameters4> value) {
			obj.setPhysicalTransferDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntRef")
	protected AdditionalReference8 clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmClientReference
	 * DeliverInformation16.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliverInformation19, Optional<AdditionalReference8>> mmClientReference = new MMMessageAssociationEnd<DeliverInformation19, Optional<AdditionalReference8>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliverInformation19.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			previousVersion_lazy = () -> DeliverInformation16.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(DeliverInformation19 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(DeliverInformation19 obj, Optional<AdditionalReference8> value) {
			obj.setClientReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation19.mmTransferor, com.tools20022.repository.msg.DeliverInformation19.mmTransferorRegisteredAccount,
						com.tools20022.repository.msg.DeliverInformation19.mmIntermediaryInformation, com.tools20022.repository.msg.DeliverInformation19.mmRequestedSettlementDate,
						com.tools20022.repository.msg.DeliverInformation19.mmSettlementAmount, com.tools20022.repository.msg.DeliverInformation19.mmStampDuty, com.tools20022.repository.msg.DeliverInformation19.mmNetAmount,
						com.tools20022.repository.msg.DeliverInformation19.mmFees, com.tools20022.repository.msg.DeliverInformation19.mmIndividualTax, com.tools20022.repository.msg.DeliverInformation19.mmForeignExchangeDetails,
						com.tools20022.repository.msg.DeliverInformation19.mmSettlementPartiesDetails, com.tools20022.repository.msg.DeliverInformation19.mmPhysicalTransfer,
						com.tools20022.repository.msg.DeliverInformation19.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation19.mmClientReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInInstructionV08.mmSettlementDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation19,
						com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation19, com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation19);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliverInformation19";
				definition = "Parameters applied to the settlement of a security transfer.";
				previousVersion_lazy = () -> DeliverInformation16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification113> getTransferor() {
		return transferor == null ? Optional.empty() : Optional.of(transferor);
	}

	public DeliverInformation19 setTransferor(PartyIdentification113 transferor) {
		this.transferor = transferor;
		return this;
	}

	public Optional<Account24> getTransferorRegisteredAccount() {
		return transferorRegisteredAccount == null ? Optional.empty() : Optional.of(transferorRegisteredAccount);
	}

	public DeliverInformation19 setTransferorRegisteredAccount(Account24 transferorRegisteredAccount) {
		this.transferorRegisteredAccount = transferorRegisteredAccount;
		return this;
	}

	public List<Intermediary41> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public DeliverInformation19 setIntermediaryInformation(List<Intermediary41> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public Optional<ISODate> getRequestedSettlementDate() {
		return requestedSettlementDate == null ? Optional.empty() : Optional.of(requestedSettlementDate);
	}

	public DeliverInformation19 setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public DeliverInformation19 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<StampDutyType2Code> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public DeliverInformation19 setStampDuty(StampDutyType2Code stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public DeliverInformation19 setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public List<Fees1> getFees() {
		return fees == null ? fees = new ArrayList<>() : fees;
	}

	public DeliverInformation19 setFees(List<Fees1> fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<Tax34> getIndividualTax() {
		return individualTax == null ? individualTax = new ArrayList<>() : individualTax;
	}

	public DeliverInformation19 setIndividualTax(List<Tax34> individualTax) {
		this.individualTax = Objects.requireNonNull(individualTax);
		return this;
	}

	public List<ForeignExchangeTerms33> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public DeliverInformation19 setForeignExchangeDetails(List<ForeignExchangeTerms33> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<DeliveringPartiesAndAccount17> getSettlementPartiesDetails() {
		return settlementPartiesDetails == null ? Optional.empty() : Optional.of(settlementPartiesDetails);
	}

	public DeliverInformation19 setSettlementPartiesDetails(DeliveringPartiesAndAccount17 settlementPartiesDetails) {
		this.settlementPartiesDetails = settlementPartiesDetails;
		return this;
	}

	public Optional<PhysicalTransferType1Code> getPhysicalTransfer() {
		return physicalTransfer == null ? Optional.empty() : Optional.of(physicalTransfer);
	}

	public DeliverInformation19 setPhysicalTransfer(PhysicalTransferType1Code physicalTransfer) {
		this.physicalTransfer = physicalTransfer;
		return this;
	}

	public Optional<DeliveryParameters4> getPhysicalTransferDetails() {
		return physicalTransferDetails == null ? Optional.empty() : Optional.of(physicalTransferDetails);
	}

	public DeliverInformation19 setPhysicalTransferDetails(DeliveryParameters4 physicalTransferDetails) {
		this.physicalTransferDetails = physicalTransferDetails;
		return this;
	}

	public Optional<AdditionalReference8> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public DeliverInformation19 setClientReference(AdditionalReference8 clientReference) {
		this.clientReference = clientReference;
		return this;
	}
}