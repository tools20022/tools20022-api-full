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
import com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02;
import com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the settlement condition modification request
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#mmReference
 * RequestDetails6.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmAutomaticBorrowing
 * RequestDetails6.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmRetainIndicator
 * RequestDetails6.mmRetainIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#mmLinkage
 * RequestDetails6.mmLinkage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#mmPriority
 * RequestDetails6.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmOtherProcessing
 * RequestDetails6.mmOtherProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmPartialSettlementIndicator
 * RequestDetails6.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmSecuritiesRTGS
 * RequestDetails6.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmHoldIndicator
 * RequestDetails6.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmMatchingDenial
 * RequestDetails6.mmMatchingDenial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmUnilateralSplit
 * RequestDetails6.mmUnilateralSplit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#mmLinkages
 * RequestDetails6.mmLinkages}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#mmRequestDetails
 * SecuritiesSettlementConditionModificationStatusAdviceV02.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02#mmRequestDetails
 * SecuritiesSettlementConditionsModificationRequestV02.mmRequestDetails}</li>
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
 * "RequestDetails6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the settlement condition modification request"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8
 * RequestDetails8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RequestDetails6", propOrder = {"reference", "automaticBorrowing", "retainIndicator", "linkage", "priority", "otherProcessing", "partialSettlementIndicator", "securitiesRTGS", "holdIndicator", "matchingDenial",
		"unilateralSplit", "linkages"})
public class RequestDetails6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected References7 reference;
	/**
	 * References of the transaction for which the securities settlement
	 * condition modification is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.References7
	 * References7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References of the transaction for which the securities settlement condition modification is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "References of the transaction for which the securities settlement condition modification is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.References7.mmObject();
		}
	};
	protected AutomaticBorrowing2Choice automaticBorrowing;
	/**
	 * Condition for automatic borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice
	 * AutomaticBorrowing2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
	 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAutomaticBorrowing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing2Choice.mmObject();
		}
	};
	protected YesNoIndicator retainIndicator;
	/**
	 * Specifies whether the instruction due to expire is confirmed for
	 * settlement
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetainIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the instruction due to expire is confirmed for settlement"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRetainIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "RtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetainIndicator";
			definition = "Specifies whether the instruction due to expire is confirmed for settlement";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected LinkageType1Choice linkage;
	/**
	 * Specifies the type of linkage requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.LinkageType1Choice
	 * LinkageType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of linkage requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkage = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "Lkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkage";
			definition = "Specifies the type of linkage requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkageType1Choice.mmObject();
		}
	};
	protected PriorityNumeric1Choice priority;
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriority = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification20> otherProcessing;
	/**
	 * Specifies another type of processing change request
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrcg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies another type of processing change request"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherProcessing = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "OthrPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessing";
			definition = "Specifies another type of processing change request";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification20.mmObject();
		}
	};
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * Specifies whether partial settlement is allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}
	};
	protected SecuritiesRTGS1Choice securitiesRTGS;
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice
	 * SecuritiesRTGS1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRTGS = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS1Choice.mmObject();
		}
	};
	protected HoldIndicator2 holdIndicator;
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldIndicator2
	 * HoldIndicator2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHoldIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HoldIndicator2.mmObject();
		}
	};
	protected MatchingDenied1Choice matchingDenial;
	/**
	 * Specifies the matching processing change requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingDenied1Choice
	 * MatchingDenied1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgDnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingDenial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching processing change requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchingDenial = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "MtchgDnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingDenial";
			definition = "Specifies the matching processing change requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingDenied1Choice.mmObject();
		}
	};
	protected UnilateralSplit1Choice unilateralSplit;
	/**
	 * Specifies that the transaction is requested to be unilaterally split.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice
	 * UnilateralSplit1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnltrlSplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnilateralSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction is requested to be unilaterally split."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnilateralSplit = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "UnltrlSplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnilateralSplit";
			definition = "Specifies that the transaction is requested to be unilaterally split.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnilateralSplit1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Linkages10> linkages;
	/**
	 * Information regarding the linkage requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Linkages10 Linkages10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6
	 * RequestDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the linkage requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkages = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestDetails6.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Information regarding the linkage requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Linkages10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RequestDetails6.mmReference, RequestDetails6.mmAutomaticBorrowing, RequestDetails6.mmRetainIndicator, RequestDetails6.mmLinkage, RequestDetails6.mmPriority,
						RequestDetails6.mmOtherProcessing, RequestDetails6.mmPartialSettlementIndicator, RequestDetails6.mmSecuritiesRTGS, RequestDetails6.mmHoldIndicator, RequestDetails6.mmMatchingDenial,
						RequestDetails6.mmUnilateralSplit, RequestDetails6.mmLinkages);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementConditionModificationStatusAdviceV02.mmRequestDetails, SecuritiesSettlementConditionsModificationRequestV02.mmRequestDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestDetails6";
				definition = "Details of the settlement condition modification request";
				nextVersions_lazy = () -> Arrays.asList(RequestDetails8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ref", required = true)
	public References7 getReference() {
		return reference;
	}

	public void setReference(com.tools20022.repository.msg.References7 reference) {
		this.reference = reference;
	}

	@XmlElement(name = "AutomtcBrrwg")
	public AutomaticBorrowing2Choice getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public void setAutomaticBorrowing(AutomaticBorrowing2Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
	}

	@XmlElement(name = "RtnInd")
	public YesNoIndicator getRetainIndicator() {
		return retainIndicator;
	}

	public void setRetainIndicator(YesNoIndicator retainIndicator) {
		this.retainIndicator = retainIndicator;
	}

	@XmlElement(name = "Lkg")
	public LinkageType1Choice getLinkage() {
		return linkage;
	}

	public void setLinkage(LinkageType1Choice linkage) {
		this.linkage = linkage;
	}

	@XmlElement(name = "Prty")
	public PriorityNumeric1Choice getPriority() {
		return priority;
	}

	public void setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
	}

	@XmlElement(name = "OthrPrcg")
	public List<GenericIdentification20> getOtherProcessing() {
		return otherProcessing;
	}

	public void setOtherProcessing(List<com.tools20022.repository.msg.GenericIdentification20> otherProcessing) {
		this.otherProcessing = otherProcessing;
	}

	@XmlElement(name = "PrtlSttlmInd")
	public SettlementTransactionCondition5Code getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	@XmlElement(name = "SctiesRTGS")
	public SecuritiesRTGS1Choice getSecuritiesRTGS() {
		return securitiesRTGS;
	}

	public void setSecuritiesRTGS(SecuritiesRTGS1Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
	}

	@XmlElement(name = "HldInd")
	public HoldIndicator2 getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(com.tools20022.repository.msg.HoldIndicator2 holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	@XmlElement(name = "MtchgDnl")
	public MatchingDenied1Choice getMatchingDenial() {
		return matchingDenial;
	}

	public void setMatchingDenial(MatchingDenied1Choice matchingDenial) {
		this.matchingDenial = matchingDenial;
	}

	@XmlElement(name = "UnltrlSplt")
	public UnilateralSplit1Choice getUnilateralSplit() {
		return unilateralSplit;
	}

	public void setUnilateralSplit(UnilateralSplit1Choice unilateralSplit) {
		this.unilateralSplit = unilateralSplit;
	}

	@XmlElement(name = "Lnkgs")
	public List<Linkages10> getLinkages() {
		return linkages;
	}

	public void setLinkages(List<com.tools20022.repository.msg.Linkages10> linkages) {
		this.linkages = linkages;
	}
}