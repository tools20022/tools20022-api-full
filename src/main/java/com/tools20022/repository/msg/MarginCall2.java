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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCall2", propOrder = {"collateralAccountIdentification", "marginCallResult", "marginDetailDueToA", "marginDetailDueToB", "requirementDetailsDueToA", "requirementDetailsDueToB", "expectedCollateralDueToA",
		"expectedCollateralDueToB"})
public class MarginCall2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralAccount2 collateralAccountIdentification;
	/**
	 * Provides additional information on the collateral account of the party
	 * delivering/receiving the collateral.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCollateralAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides additional information on the collateral account of the party delivering/receiving the collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralAccount2.mmObject();
		}
	};
	protected MarginCallResult3 marginCallResult;
	/**
	 * Summation of the call amounts per margin type. It is provided for the
	 * purposes of carrying forward for future messages that are used to compare
	 * the margin call results to determine whether a call is agreed or
	 * full/partially disputed.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginCallResult = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginCallResult3.mmObject();
		}
	};
	protected MarginCall1 marginDetailDueToA;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * A.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginDetailDueToA = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnDtlDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
		}
	};
	protected MarginCall1 marginDetailDueToB;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * B.
	 * <p>
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
	public static final MMMessageAssociationEnd mmMarginDetailDueToB = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginCall2.mmObject();
			isDerived = false;
			xmlTag = "MrgnDtlDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
		}
	};
	protected MarginRequirement1Choice requirementDetailsDueToA;
	/**
	 * Amount of expected margin that will be either delivered to party A by
	 * party B or recalled to party A from party B.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRequirementDetailsDueToA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmRiskToCover;
			componentContext_lazy = () -> MarginCall2.mmObject();
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
	};
	protected MarginRequirement1Choice requirementDetailsDueToB;
	/**
	 * Amount of expected margin that will be either delivered to party B by
	 * party A or recalled to party B from party A.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRequirementDetailsDueToB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmRiskToCover;
			componentContext_lazy = () -> MarginCall2.mmObject();
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
	};
	protected ExpectedCollateral2Choice expectedCollateralDueToA;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party A by party B or recalled to party A from party B.
	 * <p>
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
	public static final MMMessageAssociationEnd mmExpectedCollateralDueToA = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> MarginCall2.mmObject();
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
	};
	protected ExpectedCollateral2Choice expectedCollateralDueToB;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party B by party A or recalled to party B from party A.
	 * <p>
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
	public static final MMMessageAssociationEnd mmExpectedCollateralDueToB = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExpectedCollateralType.mmObject();
			componentContext_lazy = () -> MarginCall2.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginCall2.mmCollateralAccountIdentification, MarginCall2.mmMarginCallResult, MarginCall2.mmMarginDetailDueToA, MarginCall2.mmMarginDetailDueToB,
						MarginCall2.mmRequirementDetailsDueToA, MarginCall2.mmRequirementDetailsDueToB, MarginCall2.mmExpectedCollateralDueToA, MarginCall2.mmExpectedCollateralDueToB);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV04.mmMarginCallDetails);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCall2";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollAcctId")
	public CollateralAccount2 getCollateralAccountIdentification() {
		return collateralAccountIdentification;
	}

	public void setCollateralAccountIdentification(com.tools20022.repository.msg.CollateralAccount2 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
	}

	@XmlElement(name = "MrgnCallRslt", required = true)
	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public void setMarginCallResult(com.tools20022.repository.msg.MarginCallResult3 marginCallResult) {
		this.marginCallResult = marginCallResult;
	}

	@XmlElement(name = "MrgnDtlDueToA")
	public MarginCall1 getMarginDetailDueToA() {
		return marginDetailDueToA;
	}

	public void setMarginDetailDueToA(com.tools20022.repository.msg.MarginCall1 marginDetailDueToA) {
		this.marginDetailDueToA = marginDetailDueToA;
	}

	@XmlElement(name = "MrgnDtlDueToB")
	public MarginCall1 getMarginDetailDueToB() {
		return marginDetailDueToB;
	}

	public void setMarginDetailDueToB(com.tools20022.repository.msg.MarginCall1 marginDetailDueToB) {
		this.marginDetailDueToB = marginDetailDueToB;
	}

	@XmlElement(name = "RqrmntDtlsDueToA")
	public MarginRequirement1Choice getRequirementDetailsDueToA() {
		return requirementDetailsDueToA;
	}

	public void setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
	}

	@XmlElement(name = "RqrmntDtlsDueToB")
	public MarginRequirement1Choice getRequirementDetailsDueToB() {
		return requirementDetailsDueToB;
	}

	public void setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
	}

	@XmlElement(name = "XpctdCollDueToA")
	public ExpectedCollateral2Choice getExpectedCollateralDueToA() {
		return expectedCollateralDueToA;
	}

	public void setExpectedCollateralDueToA(ExpectedCollateral2Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
	}

	@XmlElement(name = "XpctdCollDueToB")
	public ExpectedCollateral2Choice getExpectedCollateralDueToB() {
		return expectedCollateralDueToB;
	}

	public void setExpectedCollateralDueToB(ExpectedCollateral2Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
	}
}