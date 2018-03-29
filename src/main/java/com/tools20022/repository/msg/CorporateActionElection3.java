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
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01;
import com.tools20022.repository.choice.CorporateActionOption1FormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionCashMovements2;
import com.tools20022.repository.msg.CorporateActionSecuritiesMovement2;
import com.tools20022.repository.msg.SecuritiesAccount7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about a corporate action election.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmAccountDetails
 * CorporateActionElection3.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionType
 * CorporateActionElection3.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionNumber
 * CorporateActionElection3.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedUnderlyingSecuritiesQuantity
 * CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedSecuritiesQuantityToReceive
 * CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmProposedRate
 * CorporateActionElection3.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmCashMovementDetails
 * CorporateActionElection3.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmSecuritiesMovementDetails
 * CorporateActionElection3.mmSecuritiesMovementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
 * CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmElectionDetails
 * AgentCAElectionAdviceV01.mmElectionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmElectionDetails
 * AgentCAElectionCancellationRequestV01.mmElectionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionElection3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about a corporate action election."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionElection3", propOrder = {"accountDetails", "optionType", "optionNumber", "instructedUnderlyingSecuritiesQuantity", "instructedSecuritiesQuantityToReceive", "proposedRate", "cashMovementDetails",
		"securitiesMovementDetails"})
public class CorporateActionElection3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctDtls")
	protected SecuritiesAccount7 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount7
	 * SecuritiesAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionElection3, Optional<SecuritiesAccount7>> mmAccountDetails = new MMMessageAssociationEnd<CorporateActionElection3, Optional<SecuritiesAccount7>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount7.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount7> getValue(CorporateActionElection3 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<SecuritiesAccount7> value) {
			obj.setAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnTp")
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionElection3, Optional<CorporateActionOption1FormatChoice>> mmOptionType = new MMMessageAttribute<CorporateActionElection3, Optional<CorporateActionOption1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}

		@Override
		public Optional<CorporateActionOption1FormatChoice> getValue(CorporateActionElection3 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<CorporateActionOption1FormatChoice> value) {
			obj.setOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnNb")
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionElection3, Optional<Exact3NumericText>> mmOptionNumber = new MMMessageAttribute<CorporateActionElection3, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(CorporateActionElection3 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<Exact3NumericText> value) {
			obj.setOptionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdUndrlygSctiesQty")
	protected UnitOrFaceAmount1Choice instructedUnderlyingSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdUndrlygSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedUnderlyingSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of underlying securities to which this instruction applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionElection3, Optional<UnitOrFaceAmount1Choice>> mmInstructedUnderlyingSecuritiesQuantity = new MMMessageAttribute<CorporateActionElection3, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "InstdUndrlygSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedUnderlyingSecuritiesQuantity";
			definition = "Quantity of underlying securities to which this instruction applies.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateActionElection3 obj) {
			return obj.getInstructedUnderlyingSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setInstructedUnderlyingSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdSctiesQtyToRcv")
	protected UnitOrFaceAmount1Choice instructedSecuritiesQuantityToReceive;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdSctiesQtyToRcv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedSecuritiesQuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, eg, as a result of dividend reinvestment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionElection3, Optional<UnitOrFaceAmount1Choice>> mmInstructedSecuritiesQuantityToReceive = new MMMessageAttribute<CorporateActionElection3, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "InstdSctiesQtyToRcv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedSecuritiesQuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, eg, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateActionElection3 obj) {
			return obj.getInstructedSecuritiesQuantityToReceive();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setInstructedSecuritiesQuantityToReceive(value.orElse(null));
		}
	};
	@XmlElement(name = "PropsdRate")
	protected PercentageRate proposedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
	 * BiddingConditions.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionElection3, Optional<PercentageRate>> mmProposedRate = new MMMessageAttribute<CorporateActionElection3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionElection3 obj) {
			return obj.getProposedRate();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, Optional<PercentageRate> value) {
			obj.setProposedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CshMvmntDtls")
	protected List<CorporateActionCashMovements2> cashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement resulting from the election instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionElection3, List<CorporateActionCashMovements2>> mmCashMovementDetails = new MMMessageAssociationEnd<CorporateActionElection3, List<CorporateActionCashMovements2>>() {
		{
			businessElementTrace_lazy = () -> BookEntry.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement resulting from the election instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionCashMovements2.mmObject();
		}

		@Override
		public List<CorporateActionCashMovements2> getValue(CorporateActionElection3 obj) {
			return obj.getCashMovementDetails();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, List<CorporateActionCashMovements2> value) {
			obj.setCashMovementDetails(value);
		}
	};
	@XmlElement(name = "SctiesMvmntDtls")
	protected List<CorporateActionSecuritiesMovement2> securitiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
	 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities movement resulting from the election instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionElection3, List<CorporateActionSecuritiesMovement2>> mmSecuritiesMovementDetails = new MMMessageAssociationEnd<CorporateActionElection3, List<CorporateActionSecuritiesMovement2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmSecuritiesTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement resulting from the election instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
		}

		@Override
		public List<CorporateActionSecuritiesMovement2> getValue(CorporateActionElection3 obj) {
			return obj.getSecuritiesMovementDetails();
		}

		@Override
		public void setValue(CorporateActionElection3 obj, List<CorporateActionSecuritiesMovement2> value) {
			obj.setSecuritiesMovementDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection3.mmAccountDetails, com.tools20022.repository.msg.CorporateActionElection3.mmOptionType,
						com.tools20022.repository.msg.CorporateActionElection3.mmOptionNumber, com.tools20022.repository.msg.CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive, com.tools20022.repository.msg.CorporateActionElection3.mmProposedRate,
						com.tools20022.repository.msg.CorporateActionElection3.mmCashMovementDetails, com.tools20022.repository.msg.CorporateActionElection3.mmSecuritiesMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionAdviceV01.mmElectionDetails, AgentCAElectionCancellationRequestV01.mmElectionDetails);
				trace_lazy = () -> CorporateActionElection.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionElection3";
				definition = "Provides information about a corporate action election.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesAccount7> getAccountDetails() {
		return accountDetails == null ? Optional.empty() : Optional.of(accountDetails);
	}

	public CorporateActionElection3 setAccountDetails(SecuritiesAccount7 accountDetails) {
		this.accountDetails = accountDetails;
		return this;
	}

	public Optional<CorporateActionOption1FormatChoice> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public CorporateActionElection3 setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<Exact3NumericText> getOptionNumber() {
		return optionNumber == null ? Optional.empty() : Optional.of(optionNumber);
	}

	public CorporateActionElection3 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getInstructedUnderlyingSecuritiesQuantity() {
		return instructedUnderlyingSecuritiesQuantity == null ? Optional.empty() : Optional.of(instructedUnderlyingSecuritiesQuantity);
	}

	public CorporateActionElection3 setInstructedUnderlyingSecuritiesQuantity(UnitOrFaceAmount1Choice instructedUnderlyingSecuritiesQuantity) {
		this.instructedUnderlyingSecuritiesQuantity = instructedUnderlyingSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getInstructedSecuritiesQuantityToReceive() {
		return instructedSecuritiesQuantityToReceive == null ? Optional.empty() : Optional.of(instructedSecuritiesQuantityToReceive);
	}

	public CorporateActionElection3 setInstructedSecuritiesQuantityToReceive(UnitOrFaceAmount1Choice instructedSecuritiesQuantityToReceive) {
		this.instructedSecuritiesQuantityToReceive = instructedSecuritiesQuantityToReceive;
		return this;
	}

	public Optional<PercentageRate> getProposedRate() {
		return proposedRate == null ? Optional.empty() : Optional.of(proposedRate);
	}

	public CorporateActionElection3 setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
		return this;
	}

	public List<CorporateActionCashMovements2> getCashMovementDetails() {
		return cashMovementDetails == null ? cashMovementDetails = new ArrayList<>() : cashMovementDetails;
	}

	public CorporateActionElection3 setCashMovementDetails(List<CorporateActionCashMovements2> cashMovementDetails) {
		this.cashMovementDetails = Objects.requireNonNull(cashMovementDetails);
		return this;
	}

	public List<CorporateActionSecuritiesMovement2> getSecuritiesMovementDetails() {
		return securitiesMovementDetails == null ? securitiesMovementDetails = new ArrayList<>() : securitiesMovementDetails;
	}

	public CorporateActionElection3 setSecuritiesMovementDetails(List<CorporateActionSecuritiesMovement2> securitiesMovementDetails) {
		this.securitiesMovementDetails = Objects.requireNonNull(securitiesMovementDetails);
		return this;
	}
}