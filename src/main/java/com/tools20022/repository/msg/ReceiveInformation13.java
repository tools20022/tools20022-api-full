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
import com.tools20022.repository.area.sese.TransferOutInstructionV05;
import com.tools20022.repository.codeset.PhysicalTransferType1Code;
import com.tools20022.repository.codeset.StampDutyType2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmRequestedSettlementDate
 * ReceiveInformation13.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmSettlementAmount
 * ReceiveInformation13.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmStampDuty
 * ReceiveInformation13.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmNetAmount
 * ReceiveInformation13.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmSettlementPartiesDetails
 * ReceiveInformation13.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmChargeDetails
 * ReceiveInformation13.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmCommissionDetails
 * ReceiveInformation13.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmTaxDetails
 * ReceiveInformation13.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmForeignExchangeDetails
 * ReceiveInformation13.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmPhysicalTransfer
 * ReceiveInformation13.mmPhysicalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmPhysicalTransferDetails
 * ReceiveInformation13.mmPhysicalTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmClientReference
 * ReceiveInformation13.mmClientReference}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmSettlementDetails
 * TransferOutInstructionV05.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceiveInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation13
 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation13
 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation13
 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation15
 * ReceiveInformation15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9
 * ReceiveInformation9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceiveInformation13", propOrder = {"requestedSettlementDate", "settlementAmount", "stampDuty", "netAmount", "settlementPartiesDetails", "chargeDetails", "commissionDetails", "taxDetails", "foreignExchangeDetails",
		"physicalTransfer", "physicalTransferDetails", "clientReference"})
public class ReceiveInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmRequestedSettlementDate
	 * ReceiveInformation15.mmRequestedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmRequestedSettlementDate
	 * ReceiveInformation9.mmRequestedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<ISODate>> mmRequestedSettlementDate = new MMMessageAttribute<ReceiveInformation13, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmRequestedSettlementDate);
			previousVersion_lazy = () -> ReceiveInformation9.mmRequestedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ReceiveInformation13 obj) {
			return obj.getRequestedSettlementDate();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmSettlementAmount
	 * ReceiveInformation15.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmSettlementAmount
	 * ReceiveInformation9.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<ReceiveInformation13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmSettlementAmount);
			previousVersion_lazy = () -> ReceiveInformation9.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ReceiveInformation13 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<ActiveCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the settlement amount includes the stamp duty amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmStampDuty
	 * ReceiveInformation15.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmStampDuty
	 * ReceiveInformation9.mmStampDuty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<StampDutyType2Code>> mmStampDuty = new MMMessageAttribute<ReceiveInformation13, Optional<StampDutyType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Indicates whether the settlement amount includes the stamp duty amount.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmStampDuty);
			previousVersion_lazy = () -> ReceiveInformation9.mmStampDuty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StampDutyType2Code.mmObject();
		}

		@Override
		public Optional<StampDutyType2Code> getValue(ReceiveInformation13 obj) {
			return obj.getStampDuty();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<StampDutyType2Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmNetAmount
	 * ReceiveInformation15.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmNetAmount
	 * ReceiveInformation9.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<ActiveCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<ReceiveInformation13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Deal amount.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmNetAmount);
			previousVersion_lazy = () -> ReceiveInformation9.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ReceiveInformation13 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPtiesDtls")
	protected ReceivingPartiesAndAccount9 settlementPartiesDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
	 * ReceivingPartiesAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmSettlementPartiesDetails
	 * ReceiveInformation15.mmSettlementPartiesDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmSettlementPartiesDetails
	 * ReceiveInformation9.mmSettlementPartiesDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, Optional<ReceivingPartiesAndAccount9>> mmSettlementPartiesDetails = new MMMessageAssociationEnd<ReceiveInformation13, Optional<ReceivingPartiesAndAccount9>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesDetails";
			definition = "Chain of parties involved in the settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmSettlementPartiesDetails);
			previousVersion_lazy = () -> ReceiveInformation9.mmSettlementPartiesDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReceivingPartiesAndAccount9.mmObject();
		}

		@Override
		public Optional<ReceivingPartiesAndAccount9> getValue(ReceiveInformation13 obj) {
			return obj.getSettlementPartiesDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<ReceivingPartiesAndAccount9> value) {
			obj.setSettlementPartiesDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge20> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge20 Charge20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge related to the transfer of a financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmChargeDetails
	 * ReceiveInformation15.mmChargeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmChargeDetails
	 * ReceiveInformation9.mmChargeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, List<Charge20>> mmChargeDetails = new MMMessageAssociationEnd<ReceiveInformation13, List<Charge20>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmChargeDetails);
			previousVersion_lazy = () -> ReceiveInformation9.mmChargeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge20.mmObject();
		}

		@Override
		public List<Charge20> getValue(ReceiveInformation13 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, List<Charge20> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission17> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission17
	 * Commission17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission related to the transfer of a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmCommissionDetails
	 * ReceiveInformation15.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmCommissionDetails
	 * ReceiveInformation9.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, List<Commission17>> mmCommissionDetails = new MMMessageAssociationEnd<ReceiveInformation13, List<Commission17>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmCommissionDetails);
			previousVersion_lazy = () -> ReceiveInformation9.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission17.mmObject();
		}

		@Override
		public List<Commission17> getValue(ReceiveInformation13 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, List<Commission17> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<Tax21> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax21 Tax21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmTaxDetails
	 * ReceiveInformation15.mmTaxDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmTaxDetails
	 * ReceiveInformation9.mmTaxDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, List<Tax21>> mmTaxDetails = new MMMessageAssociationEnd<ReceiveInformation13, List<Tax21>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmTaxDetails);
			previousVersion_lazy = () -> ReceiveInformation9.mmTaxDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax21.mmObject();
		}

		@Override
		public List<Tax21> getValue(ReceiveInformation13 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, List<Tax21> value) {
			obj.setTaxDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms7> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies foreign exchange details applied to the payment of charges, taxes and commissions as a result of the transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmForeignExchangeDetails
	 * ReceiveInformation15.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, List<ForeignExchangeTerms7>> mmForeignExchangeDetails = new MMMessageAssociationEnd<ReceiveInformation13, List<ForeignExchangeTerms7>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Specifies foreign exchange details applied to the payment of charges, taxes and commissions as a result of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmForeignExchangeDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms7.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms7> getValue(ReceiveInformation13 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, List<ForeignExchangeTerms7> value) {
			obj.setForeignExchangeDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmPhysicalTransfer
	 * ReceiveInformation15.mmPhysicalTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmPhysicalTransfer
	 * ReceiveInformation9.mmPhysicalTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<PhysicalTransferType1Code>> mmPhysicalTransfer = new MMMessageAttribute<ReceiveInformation13, Optional<PhysicalTransferType1Code>>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "PhysTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransfer";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmPhysicalTransfer);
			previousVersion_lazy = () -> ReceiveInformation9.mmPhysicalTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType1Code.mmObject();
		}

		@Override
		public Optional<PhysicalTransferType1Code> getValue(ReceiveInformation13 obj) {
			return obj.getPhysicalTransfer();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<PhysicalTransferType1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of a physical delivery."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmPhysicalTransferDetails
	 * ReceiveInformation15.mmPhysicalTransferDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmPhysicalTransferDetails
	 * ReceiveInformation9.mmPhysicalTransferDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation13, Optional<DeliveryParameters4>> mmPhysicalTransferDetails = new MMMessageAssociationEnd<ReceiveInformation13, Optional<DeliveryParameters4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "PhysTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetails";
			definition = "Parameters of a physical delivery.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmPhysicalTransferDetails);
			previousVersion_lazy = () -> ReceiveInformation9.mmPhysicalTransferDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters4.mmObject();
		}

		@Override
		public Optional<DeliveryParameters4> getValue(ReceiveInformation13 obj) {
			return obj.getPhysicalTransferDetails();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<DeliveryParameters4> value) {
			obj.setPhysicalTransferDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmClientReference
	 * ReceiveInformation15.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation13, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<ReceiveInformation13, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation13.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReceiveInformation13 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(ReceiveInformation13 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceiveInformation13.mmRequestedSettlementDate, com.tools20022.repository.msg.ReceiveInformation13.mmSettlementAmount,
						com.tools20022.repository.msg.ReceiveInformation13.mmStampDuty, com.tools20022.repository.msg.ReceiveInformation13.mmNetAmount, com.tools20022.repository.msg.ReceiveInformation13.mmSettlementPartiesDetails,
						com.tools20022.repository.msg.ReceiveInformation13.mmChargeDetails, com.tools20022.repository.msg.ReceiveInformation13.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation13.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation13.mmForeignExchangeDetails, com.tools20022.repository.msg.ReceiveInformation13.mmPhysicalTransfer,
						com.tools20022.repository.msg.ReceiveInformation13.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation13.mmClientReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutInstructionV05.mmSettlementDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation13,
						com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation13, com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceiveInformation13";
				definition = "Parameters applied to the settlement of a security transfer.";
				nextVersions_lazy = () -> Arrays.asList(ReceiveInformation15.mmObject());
				previousVersion_lazy = () -> ReceiveInformation9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getRequestedSettlementDate() {
		return requestedSettlementDate == null ? Optional.empty() : Optional.of(requestedSettlementDate);
	}

	public ReceiveInformation13 setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public ReceiveInformation13 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<StampDutyType2Code> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public ReceiveInformation13 setStampDuty(StampDutyType2Code stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public ReceiveInformation13 setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public Optional<ReceivingPartiesAndAccount9> getSettlementPartiesDetails() {
		return settlementPartiesDetails == null ? Optional.empty() : Optional.of(settlementPartiesDetails);
	}

	public ReceiveInformation13 setSettlementPartiesDetails(ReceivingPartiesAndAccount9 settlementPartiesDetails) {
		this.settlementPartiesDetails = settlementPartiesDetails;
		return this;
	}

	public List<Charge20> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public ReceiveInformation13 setChargeDetails(List<Charge20> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission17> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public ReceiveInformation13 setCommissionDetails(List<Commission17> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Tax21> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public ReceiveInformation13 setTaxDetails(List<Tax21> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public List<ForeignExchangeTerms7> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public ReceiveInformation13 setForeignExchangeDetails(List<ForeignExchangeTerms7> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<PhysicalTransferType1Code> getPhysicalTransfer() {
		return physicalTransfer == null ? Optional.empty() : Optional.of(physicalTransfer);
	}

	public ReceiveInformation13 setPhysicalTransfer(PhysicalTransferType1Code physicalTransfer) {
		this.physicalTransfer = physicalTransfer;
		return this;
	}

	public Optional<DeliveryParameters4> getPhysicalTransferDetails() {
		return physicalTransferDetails == null ? Optional.empty() : Optional.of(physicalTransferDetails);
	}

	public ReceiveInformation13 setPhysicalTransferDetails(DeliveryParameters4 physicalTransferDetails) {
		this.physicalTransferDetails = physicalTransferDetails;
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public ReceiveInformation13 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}
}