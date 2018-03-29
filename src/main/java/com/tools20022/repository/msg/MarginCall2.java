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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.MarginCallRequestV04;
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.choice.MarginRequirement1Choice;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.entity.ExpectedCollateralType;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount2;
import com.tools20022.repository.msg.MarginCall1;
import com.tools20022.repository.msg.MarginCallResult3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the calculation and the resulting margin and independent amount
 * needed to cover the risk exposure of one party versus another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmCollateralAccountIdentification
 * MarginCall2.mmCollateralAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginCallResult
 * MarginCall2.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginDetailDueToA
 * MarginCall2.mmMarginDetailDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginDetailDueToB
 * MarginCall2.mmMarginDetailDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmRequirementDetailsDueToA
 * MarginCall2.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmRequirementDetailsDueToB
 * MarginCall2.mmRequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmExpectedCollateralDueToA
 * MarginCall2.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmExpectedCollateralDueToB
 * MarginCall2.mmExpectedCollateralDueToB}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallDetails
 * MarginCallRequestV04.mmMarginCallDetails}</li>
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
 * "MarginCall2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCall2", propOrder = {"collateralAccountIdentification", "marginCallResult", "marginDetailDueToA", "marginDetailDueToB", "requirementDetailsDueToA", "requirementDetailsDueToB", "expectedCollateralDueToA",
		"expectedCollateralDueToB"})
public class MarginCall2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollAcctId")
	protected CollateralAccount2 collateralAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAccount2
	 * CollateralAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the collateral account of the party delivering/receiving the collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<CollateralAccount2>> mmCollateralAccountIdentification = new MMMessageAssociationEnd<MarginCall2, Optional<CollateralAccount2>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the collateral account of the party delivering/receiving the collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralAccount2.mmObject();
		}

		@Override
		public Optional<CollateralAccount2> getValue(MarginCall2 obj) {
			return obj.getCollateralAccountIdentification();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<CollateralAccount2> value) {
			obj.setCollateralAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnCallRslt", required = true)
	protected MarginCallResult3 marginCallResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, MarginCallResult3> mmMarginCallResult = new MMMessageAssociationEnd<MarginCall2, MarginCallResult3>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCallResult3.mmObject();
		}

		@Override
		public MarginCallResult3 getValue(MarginCall2 obj) {
			return obj.getMarginCallResult();
		}

		@Override
		public void setValue(MarginCall2 obj, MarginCallResult3 value) {
			obj.setMarginCallResult(value);
		}
	};
	@XmlElement(name = "MrgnDtlDueToA")
	protected MarginCall1 marginDetailDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<MarginCall1>> mmMarginDetailDueToA = new MMMessageAssociationEnd<MarginCall2, Optional<MarginCall1>>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnDtlDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCall2 obj) {
			return obj.getMarginDetailDueToA();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<MarginCall1> value) {
			obj.setMarginDetailDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnDtlDueToB")
	protected MarginCall1 marginDetailDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<MarginCall1>> mmMarginDetailDueToB = new MMMessageAssociationEnd<MarginCall2, Optional<MarginCall1>>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnDtlDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCall2 obj) {
			return obj.getMarginDetailDueToB();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<MarginCall1> value) {
			obj.setMarginDetailDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "RqrmntDtlsDueToA")
	protected MarginRequirement1Choice requirementDetailsDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmRiskToCover
	 * CollateralManagement.mmRiskToCover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToA = new MMMessageAssociationEnd<MarginCall2, Optional<MarginRequirement1Choice>>() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmRiskToCover;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "RqrmntDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToA";
			definition = "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCall2 obj) {
			return obj.getRequirementDetailsDueToA();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<MarginRequirement1Choice> value) {
			obj.setRequirementDetailsDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "RqrmntDtlsDueToB")
	protected MarginRequirement1Choice requirementDetailsDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmRiskToCover
	 * CollateralManagement.mmRiskToCover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToB = new MMMessageAssociationEnd<MarginCall2, Optional<MarginRequirement1Choice>>() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmRiskToCover;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "RqrmntDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToB";
			definition = "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCall2 obj) {
			return obj.getRequirementDetailsDueToB();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<MarginRequirement1Choice> value) {
			obj.setRequirementDetailsDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCollDueToA")
	protected ExpectedCollateral2Choice expectedCollateralDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<ExpectedCollateral2Choice>> mmExpectedCollateralDueToA = new MMMessageAssociationEnd<MarginCall2, Optional<ExpectedCollateral2Choice>>() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "XpctdCollDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToA";
			definition = "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral2Choice> getValue(MarginCall2 obj) {
			return obj.getExpectedCollateralDueToA();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<ExpectedCollateral2Choice> value) {
			obj.setExpectedCollateralDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCollDueToB")
	protected ExpectedCollateral2Choice expectedCollateralDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall2, Optional<ExpectedCollateral2Choice>> mmExpectedCollateralDueToB = new MMMessageAssociationEnd<MarginCall2, Optional<ExpectedCollateral2Choice>>() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "XpctdCollDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToB";
			definition = "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral2Choice> getValue(MarginCall2 obj) {
			return obj.getExpectedCollateralDueToB();
		}

		@Override
		public void setValue(MarginCall2 obj, Optional<ExpectedCollateral2Choice> value) {
			obj.setExpectedCollateralDueToB(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCall2.mmCollateralAccountIdentification, com.tools20022.repository.msg.MarginCall2.mmMarginCallResult,
						com.tools20022.repository.msg.MarginCall2.mmMarginDetailDueToA, com.tools20022.repository.msg.MarginCall2.mmMarginDetailDueToB, com.tools20022.repository.msg.MarginCall2.mmRequirementDetailsDueToA,
						com.tools20022.repository.msg.MarginCall2.mmRequirementDetailsDueToB, com.tools20022.repository.msg.MarginCall2.mmExpectedCollateralDueToA, com.tools20022.repository.msg.MarginCall2.mmExpectedCollateralDueToB);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV04.mmMarginCallDetails);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCall2";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CollateralAccount2> getCollateralAccountIdentification() {
		return collateralAccountIdentification == null ? Optional.empty() : Optional.of(collateralAccountIdentification);
	}

	public MarginCall2 setCollateralAccountIdentification(CollateralAccount2 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
		return this;
	}

	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public MarginCall2 setMarginCallResult(MarginCallResult3 marginCallResult) {
		this.marginCallResult = Objects.requireNonNull(marginCallResult);
		return this;
	}

	public Optional<MarginCall1> getMarginDetailDueToA() {
		return marginDetailDueToA == null ? Optional.empty() : Optional.of(marginDetailDueToA);
	}

	public MarginCall2 setMarginDetailDueToA(MarginCall1 marginDetailDueToA) {
		this.marginDetailDueToA = marginDetailDueToA;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailDueToB() {
		return marginDetailDueToB == null ? Optional.empty() : Optional.of(marginDetailDueToB);
	}

	public MarginCall2 setMarginDetailDueToB(MarginCall1 marginDetailDueToB) {
		this.marginDetailDueToB = marginDetailDueToB;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToA() {
		return requirementDetailsDueToA == null ? Optional.empty() : Optional.of(requirementDetailsDueToA);
	}

	public MarginCall2 setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToB() {
		return requirementDetailsDueToB == null ? Optional.empty() : Optional.of(requirementDetailsDueToB);
	}

	public MarginCall2 setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
		return this;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToA() {
		return expectedCollateralDueToA == null ? Optional.empty() : Optional.of(expectedCollateralDueToA);
	}

	public MarginCall2 setExpectedCollateralDueToA(ExpectedCollateral2Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
		return this;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToB() {
		return expectedCollateralDueToB == null ? Optional.empty() : Optional.of(expectedCollateralDueToB);
	}

	public MarginCall2 setExpectedCollateralDueToB(ExpectedCollateral2Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
		return this;
	}
}