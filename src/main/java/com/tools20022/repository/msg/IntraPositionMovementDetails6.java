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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection24;
import com.tools20022.repository.msg.SupplementaryData1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmIdentification
 * IntraPositionMovementDetails6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmSettledQuantity
 * IntraPositionMovementDetails6.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmPreviouslySettledQuantity
 * IntraPositionMovementDetails6.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmRemainingToBeSettledQuantity
 * IntraPositionMovementDetails6.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmLotNumber
 * IntraPositionMovementDetails6.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmBalanceTo
 * IntraPositionMovementDetails6.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmSettlementDate
 * IntraPositionMovementDetails6.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmAvailableDate
 * IntraPositionMovementDetails6.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmCorporateActionEventType
 * IntraPositionMovementDetails6.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmCollateralMonitorAmount
 * IntraPositionMovementDetails6.mmCollateralMonitorAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmInstructionProcessingAdditionalDetails
 * IntraPositionMovementDetails6.mmInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmSupplementaryData
 * IntraPositionMovementDetails6.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionMovementDetails6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionMovementDetails6
 * ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forIntraPositionMovementDetails6
 * ConstraintCoexistenceQuantityRule.forIntraPositionMovementDetails6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionMovementDetails6", propOrder = {"identification", "settledQuantity", "previouslySettledQuantity", "remainingToBeSettledQuantity", "lotNumber", "balanceTo", "settlementDate", "availableDate",
		"corporateActionEventType", "collateralMonitorAmount", "instructionProcessingAdditionalDetails", "supplementaryData"})
public class IntraPositionMovementDetails6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected References21Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.References21Choice
	 * References21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifications (account owner and/or account servicer) of the intra-position movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<References21Choice>> mmIdentification = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<References21Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifications (account owner and/or account servicer) of the intra-position movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> References21Choice.mmObject();
		}

		@Override
		public Optional<References21Choice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<References21Choice> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldQty", required = true)
	protected FinancialInstrumentQuantity15Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, FinancialInstrumentQuantity15Choice> mmSettledQuantity = new MMMessageAssociationEnd<IntraPositionMovementDetails6, FinancialInstrumentQuantity15Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(IntraPositionMovementDetails6 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setSettledQuantity(value);
		}
	};
	@XmlElement(name = "PrevslySttldQty")
	protected FinancialInstrumentQuantity15Choice previouslySettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<FinancialInstrumentQuantity15Choice>> mmPreviouslySettledQuantity = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getPreviouslySettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setPreviouslySettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngToBeSttldQty")
	protected FinancialInstrumentQuantity15Choice remainingToBeSettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument remaining to be settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<FinancialInstrumentQuantity15Choice>> mmRemainingToBeSettledQuantity = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getRemainingToBeSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setRemainingToBeSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "LotNb")
	protected Number4Choice lotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Number4Choice
	 * Number4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a lot constituting the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<Number4Choice>> mmLotNumber = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<Number4Choice>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "LotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotNumber";
			definition = "Number identifying a lot constituting the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Number4Choice.mmObject();
		}

		@Override
		public Optional<Number4Choice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getLotNumber();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<Number4Choice> value) {
			obj.setLotNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected SecuritiesBalanceType5Choice balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice
	 * SecuritiesBalanceType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities were moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, SecuritiesBalanceType5Choice> mmBalanceTo = new MMMessageAssociationEnd<IntraPositionMovementDetails6, SecuritiesBalanceType5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities were moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesBalanceType5Choice.mmObject();
		}

		@Override
		public SecuritiesBalanceType5Choice getValue(IntraPositionMovementDetails6 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, SecuritiesBalanceType5Choice value) {
			obj.setBalanceTo(value);
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected DateAndDateTimeChoice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities were moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, DateAndDateTimeChoice> mmSettlementDate = new MMMessageAssociationEnd<IntraPositionMovementDetails6, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities were moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraPositionMovementDetails6 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, DateAndDateTimeChoice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "AvlblDt")
	protected DateAndDateTimeChoice availableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time securities become available for sale (if securities become unavailable, this specifies the date/time at which they will become available again)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<DateAndDateTimeChoice>> mmAvailableDate = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time securities become available for sale (if securities become unavailable, this specifies the date/time at which they will become available again).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getAvailableDate();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setAvailableDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtTp")
	protected CorporateActionEventType4Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice
	 * CorporateActionEventType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<CorporateActionEventType4Choice>> mmCorporateActionEventType = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<CorporateActionEventType4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventType4Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventType4Choice> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getCorporateActionEventType();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<CorporateActionEventType4Choice> value) {
			obj.setCorporateActionEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "CollMntrAmt")
	protected AmountAndDirection24 collateralMonitorAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection24
	 * AmountAndDirection24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmCollateralAmount
	 * IntraPositionTransfer.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollMntrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMonitorAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral available for the delivery settlement process at the account level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<AmountAndDirection24>> mmCollateralMonitorAmount = new MMMessageAssociationEnd<IntraPositionMovementDetails6, Optional<AmountAndDirection24>>() {
		{
			businessElementTrace_lazy = () -> IntraPositionTransfer.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "CollMntrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMonitorAmount";
			definition = "Value of the collateral available for the delivery settlement process at the account level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection24.mmObject();
		}

		@Override
		public Optional<AmountAndDirection24> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getCollateralMonitorAmount();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<AmountAndDirection24> value) {
			obj.setCollateralMonitorAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected RestrictedFINXMax350Text instructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovementDetails6, Optional<RestrictedFINXMax350Text>> mmInstructionProcessingAdditionalDetails = new MMMessageAttribute<IntraPositionMovementDetails6, Optional<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovementDetails6, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<IntraPositionMovementDetails6, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails6.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IntraPositionMovementDetails6 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IntraPositionMovementDetails6 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionMovementDetails6.mmIdentification, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmSettledQuantity,
						com.tools20022.repository.msg.IntraPositionMovementDetails6.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmRemainingToBeSettledQuantity,
						com.tools20022.repository.msg.IntraPositionMovementDetails6.mmLotNumber, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmBalanceTo,
						com.tools20022.repository.msg.IntraPositionMovementDetails6.mmSettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmAvailableDate,
						com.tools20022.repository.msg.IntraPositionMovementDetails6.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmCollateralMonitorAmount,
						com.tools20022.repository.msg.IntraPositionMovementDetails6.mmInstructionProcessingAdditionalDetails, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmSupplementaryData);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionMovementDetails6,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forIntraPositionMovementDetails6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IntraPositionMovementDetails6";
				definition = "Details of the intra-position movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<References21Choice> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public IntraPositionMovementDetails6 setIdentification(References21Choice identification) {
		this.identification = identification;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getSettledQuantity() {
		return settledQuantity;
	}

	public IntraPositionMovementDetails6 setSettledQuantity(FinancialInstrumentQuantity15Choice settledQuantity) {
		this.settledQuantity = Objects.requireNonNull(settledQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getPreviouslySettledQuantity() {
		return previouslySettledQuantity == null ? Optional.empty() : Optional.of(previouslySettledQuantity);
	}

	public IntraPositionMovementDetails6 setPreviouslySettledQuantity(FinancialInstrumentQuantity15Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity == null ? Optional.empty() : Optional.of(remainingToBeSettledQuantity);
	}

	public IntraPositionMovementDetails6 setRemainingToBeSettledQuantity(FinancialInstrumentQuantity15Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
		return this;
	}

	public Optional<Number4Choice> getLotNumber() {
		return lotNumber == null ? Optional.empty() : Optional.of(lotNumber);
	}

	public IntraPositionMovementDetails6 setLotNumber(Number4Choice lotNumber) {
		this.lotNumber = lotNumber;
		return this;
	}

	public SecuritiesBalanceType5Choice getBalanceTo() {
		return balanceTo;
	}

	public IntraPositionMovementDetails6 setBalanceTo(SecuritiesBalanceType5Choice balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public IntraPositionMovementDetails6 setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getAvailableDate() {
		return availableDate == null ? Optional.empty() : Optional.of(availableDate);
	}

	public IntraPositionMovementDetails6 setAvailableDate(DateAndDateTimeChoice availableDate) {
		this.availableDate = availableDate;
		return this;
	}

	public Optional<CorporateActionEventType4Choice> getCorporateActionEventType() {
		return corporateActionEventType == null ? Optional.empty() : Optional.of(corporateActionEventType);
	}

	public IntraPositionMovementDetails6 setCorporateActionEventType(CorporateActionEventType4Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
		return this;
	}

	public Optional<AmountAndDirection24> getCollateralMonitorAmount() {
		return collateralMonitorAmount == null ? Optional.empty() : Optional.of(collateralMonitorAmount);
	}

	public IntraPositionMovementDetails6 setCollateralMonitorAmount(AmountAndDirection24 collateralMonitorAmount) {
		this.collateralMonitorAmount = collateralMonitorAmount;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraPositionMovementDetails6 setInstructionProcessingAdditionalDetails(RestrictedFINXMax350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IntraPositionMovementDetails6 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}