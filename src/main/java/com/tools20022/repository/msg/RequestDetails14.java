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
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification25;
import com.tools20022.repository.msg.HoldIndicator5;
import com.tools20022.repository.msg.Linkages28;
import com.tools20022.repository.msg.References17;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the settlement condition modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#mmReference
 * RequestDetails14.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmAutomaticBorrowing
 * RequestDetails14.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmRetainIndicator
 * RequestDetails14.mmRetainIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#mmLinkage
 * RequestDetails14.mmLinkage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#mmPriority
 * RequestDetails14.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmOtherProcessing
 * RequestDetails14.mmOtherProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmPartialSettlementIndicator
 * RequestDetails14.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmSecuritiesRTGS
 * RequestDetails14.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmHoldIndicator
 * RequestDetails14.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmMatchingDenial
 * RequestDetails14.mmMatchingDenial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmUnilateralSplit
 * RequestDetails14.mmUnilateralSplit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#mmLinkages
 * RequestDetails14.mmLinkages}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestDetails14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the settlement condition modification request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintModificationRequestPresenceRule#forRequestDetails14
 * ConstraintModificationRequestPresenceRule.forRequestDetails14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails14
 * ConstraintOtherProcessingRule.forRequestDetails14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementConditionModificationApplicabilityRule#forRequestDetails14
 * ConstraintSettlementConditionModificationApplicabilityRule.
 * forRequestDetails14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestDetails14", propOrder = {"reference", "automaticBorrowing", "retainIndicator", "linkage", "priority", "otherProcessing", "partialSettlementIndicator", "securitiesRTGS", "holdIndicator", "matchingDenial",
		"unilateralSplit", "linkages"})
public class RequestDetails14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected References17 reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.References17
	 * References17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References of the transaction for which the securities settlement condition modification is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, References17> mmReference = new MMMessageAssociationEnd<RequestDetails14, References17>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "References of the transaction for which the securities settlement condition modification is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> References17.mmObject();
		}

		@Override
		public References17 getValue(RequestDetails14 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(RequestDetails14 obj, References17 value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "AutomtcBrrwg")
	protected AutomaticBorrowing3Choice automaticBorrowing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing3Choice
	 * AutomaticBorrowing3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
	 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<AutomaticBorrowing3Choice>> mmAutomaticBorrowing = new MMMessageAssociationEnd<RequestDetails14, Optional<AutomaticBorrowing3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing3Choice.mmObject();
		}

		@Override
		public Optional<AutomaticBorrowing3Choice> getValue(RequestDetails14 obj) {
			return obj.getAutomaticBorrowing();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<AutomaticBorrowing3Choice> value) {
			obj.setAutomaticBorrowing(value.orElse(null));
		}
	};
	@XmlElement(name = "RtnInd")
	protected YesNoIndicator retainIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetainIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the instruction due to expire is confirmed for settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails14, Optional<YesNoIndicator>> mmRetainIndicator = new MMMessageAttribute<RequestDetails14, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "RtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetainIndicator";
			definition = "Specifies whether the instruction due to expire is confirmed for settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RequestDetails14 obj) {
			return obj.getRetainIndicator();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<YesNoIndicator> value) {
			obj.setRetainIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Lkg")
	protected LinkageType2Choice linkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.LinkageType2Choice
	 * LinkageType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of linkage requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<LinkageType2Choice>> mmLinkage = new MMMessageAssociationEnd<RequestDetails14, Optional<LinkageType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "Lkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkage";
			definition = "Specifies the type of linkage requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkageType2Choice.mmObject();
		}

		@Override
		public Optional<LinkageType2Choice> getValue(RequestDetails14 obj) {
			return obj.getLinkage();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<LinkageType2Choice> value) {
			obj.setLinkage(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric2Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric2Choice
	 * PriorityNumeric2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<PriorityNumeric2Choice>> mmPriority = new MMMessageAssociationEnd<RequestDetails14, Optional<PriorityNumeric2Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric2Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric2Choice> getValue(RequestDetails14 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<PriorityNumeric2Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrPrcg")
	protected List<GenericIdentification25> otherProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25
	 * GenericIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies another type of processing change request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, List<GenericIdentification25>> mmOtherProcessing = new MMMessageAssociationEnd<RequestDetails14, List<GenericIdentification25>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "OthrPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessing";
			definition = "Specifies another type of processing change request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification25.mmObject();
		}

		@Override
		public List<GenericIdentification25> getValue(RequestDetails14 obj) {
			return obj.getOtherProcessing();
		}

		@Override
		public void setValue(RequestDetails14 obj, List<GenericIdentification25> value) {
			obj.setOtherProcessing(value);
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails14, Optional<SettlementTransactionCondition5Code>> mmPartialSettlementIndicator = new MMMessageAttribute<RequestDetails14, Optional<SettlementTransactionCondition5Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}

		@Override
		public Optional<SettlementTransactionCondition5Code> getValue(RequestDetails14 obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<SettlementTransactionCondition5Code> value) {
			obj.setPartialSettlementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRTGS")
	protected SecuritiesRTGS2Choice securitiesRTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice
	 * SecuritiesRTGS2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<SecuritiesRTGS2Choice>> mmSecuritiesRTGS = new MMMessageAssociationEnd<RequestDetails14, Optional<SecuritiesRTGS2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS2Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesRTGS2Choice> getValue(RequestDetails14 obj) {
			return obj.getSecuritiesRTGS();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<SecuritiesRTGS2Choice> value) {
			obj.setSecuritiesRTGS(value.orElse(null));
		}
	};
	@XmlElement(name = "HldInd")
	protected HoldIndicator5 holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldIndicator5
	 * HoldIndicator5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<HoldIndicator5>> mmHoldIndicator = new MMMessageAssociationEnd<RequestDetails14, Optional<HoldIndicator5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldIndicator5.mmObject();
		}

		@Override
		public Optional<HoldIndicator5> getValue(RequestDetails14 obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<HoldIndicator5> value) {
			obj.setHoldIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgDnl")
	protected MatchingDenied2Choice matchingDenial;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingDenied2Choice
	 * MatchingDenied2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgDnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingDenial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching processing change requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<MatchingDenied2Choice>> mmMatchingDenial = new MMMessageAssociationEnd<RequestDetails14, Optional<MatchingDenied2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "MtchgDnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingDenial";
			definition = "Specifies the matching processing change requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingDenied2Choice.mmObject();
		}

		@Override
		public Optional<MatchingDenied2Choice> getValue(RequestDetails14 obj) {
			return obj.getMatchingDenial();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<MatchingDenied2Choice> value) {
			obj.setMatchingDenial(value.orElse(null));
		}
	};
	@XmlElement(name = "UnltrlSplt")
	protected UnilateralSplit2Choice unilateralSplit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice
	 * UnilateralSplit2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnltrlSplt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnilateralSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction is requested to be unilaterally split."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, Optional<UnilateralSplit2Choice>> mmUnilateralSplit = new MMMessageAssociationEnd<RequestDetails14, Optional<UnilateralSplit2Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "UnltrlSplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnilateralSplit";
			definition = "Specifies that the transaction is requested to be unilaterally split.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnilateralSplit2Choice.mmObject();
		}

		@Override
		public Optional<UnilateralSplit2Choice> getValue(RequestDetails14 obj) {
			return obj.getUnilateralSplit();
		}

		@Override
		public void setValue(RequestDetails14 obj, Optional<UnilateralSplit2Choice> value) {
			obj.setUnilateralSplit(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages28> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Linkages28 Linkages28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14
	 * RequestDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the linkage requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails14, List<Linkages28>> mmLinkages = new MMMessageAssociationEnd<RequestDetails14, List<Linkages28>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails14.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Information regarding the linkage requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Linkages28.mmObject();
		}

		@Override
		public List<Linkages28> getValue(RequestDetails14 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(RequestDetails14 obj, List<Linkages28> value) {
			obj.setLinkages(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestDetails14.mmReference, com.tools20022.repository.msg.RequestDetails14.mmAutomaticBorrowing,
						com.tools20022.repository.msg.RequestDetails14.mmRetainIndicator, com.tools20022.repository.msg.RequestDetails14.mmLinkage, com.tools20022.repository.msg.RequestDetails14.mmPriority,
						com.tools20022.repository.msg.RequestDetails14.mmOtherProcessing, com.tools20022.repository.msg.RequestDetails14.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails14.mmSecuritiesRTGS,
						com.tools20022.repository.msg.RequestDetails14.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails14.mmMatchingDenial, com.tools20022.repository.msg.RequestDetails14.mmUnilateralSplit,
						com.tools20022.repository.msg.RequestDetails14.mmLinkages);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintModificationRequestPresenceRule.forRequestDetails14,
						com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails14, com.tools20022.repository.constraints.ConstraintSettlementConditionModificationApplicabilityRule.forRequestDetails14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestDetails14";
				definition = "Details of the settlement condition modification request.";
			}
		});
		return mmObject_lazy.get();
	}

	public References17 getReference() {
		return reference;
	}

	public RequestDetails14 setReference(References17 reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<AutomaticBorrowing3Choice> getAutomaticBorrowing() {
		return automaticBorrowing == null ? Optional.empty() : Optional.of(automaticBorrowing);
	}

	public RequestDetails14 setAutomaticBorrowing(AutomaticBorrowing3Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
		return this;
	}

	public Optional<YesNoIndicator> getRetainIndicator() {
		return retainIndicator == null ? Optional.empty() : Optional.of(retainIndicator);
	}

	public RequestDetails14 setRetainIndicator(YesNoIndicator retainIndicator) {
		this.retainIndicator = retainIndicator;
		return this;
	}

	public Optional<LinkageType2Choice> getLinkage() {
		return linkage == null ? Optional.empty() : Optional.of(linkage);
	}

	public RequestDetails14 setLinkage(LinkageType2Choice linkage) {
		this.linkage = linkage;
		return this;
	}

	public Optional<PriorityNumeric2Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public RequestDetails14 setPriority(PriorityNumeric2Choice priority) {
		this.priority = priority;
		return this;
	}

	public List<GenericIdentification25> getOtherProcessing() {
		return otherProcessing == null ? otherProcessing = new ArrayList<>() : otherProcessing;
	}

	public RequestDetails14 setOtherProcessing(List<GenericIdentification25> otherProcessing) {
		this.otherProcessing = Objects.requireNonNull(otherProcessing);
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public RequestDetails14 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<SecuritiesRTGS2Choice> getSecuritiesRTGS() {
		return securitiesRTGS == null ? Optional.empty() : Optional.of(securitiesRTGS);
	}

	public RequestDetails14 setSecuritiesRTGS(SecuritiesRTGS2Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
		return this;
	}

	public Optional<HoldIndicator5> getHoldIndicator() {
		return holdIndicator == null ? Optional.empty() : Optional.of(holdIndicator);
	}

	public RequestDetails14 setHoldIndicator(HoldIndicator5 holdIndicator) {
		this.holdIndicator = holdIndicator;
		return this;
	}

	public Optional<MatchingDenied2Choice> getMatchingDenial() {
		return matchingDenial == null ? Optional.empty() : Optional.of(matchingDenial);
	}

	public RequestDetails14 setMatchingDenial(MatchingDenied2Choice matchingDenial) {
		this.matchingDenial = matchingDenial;
		return this;
	}

	public Optional<UnilateralSplit2Choice> getUnilateralSplit() {
		return unilateralSplit == null ? Optional.empty() : Optional.of(unilateralSplit);
	}

	public RequestDetails14 setUnilateralSplit(UnilateralSplit2Choice unilateralSplit) {
		this.unilateralSplit = unilateralSplit;
		return this;
	}

	public List<Linkages28> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public RequestDetails14 setLinkages(List<Linkages28> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}
}