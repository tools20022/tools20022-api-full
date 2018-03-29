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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acknowledgement information relative to corporate action reorganisation
 * instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmTermsAcknowledgementIndicator
 * CorporateActionAcknowledgementSD1.mmTermsAcknowledgementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition1Indicator
 * CorporateActionAcknowledgementSD1.mmCondition1Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition2Indicator
 * CorporateActionAcknowledgementSD1.mmCondition2Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition3Indicator
 * CorporateActionAcknowledgementSD1.mmCondition3Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition4Indicator
 * CorporateActionAcknowledgementSD1.mmCondition4Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition5Indicator
 * CorporateActionAcknowledgementSD1.mmCondition5Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmCondition6Indicator
 * CorporateActionAcknowledgementSD1.mmCondition6Indicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmAdjudicationOfIncompetencyAcknowledgementIndicator
 * CorporateActionAcknowledgementSD1.
 * mmAdjudicationOfIncompetencyAcknowledgementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator
 * CorporateActionAcknowledgementSD1.
 * mmLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmInstructionDeletionAcknowledgementIndicator
 * CorporateActionAcknowledgementSD1.
 * mmInstructionDeletionAcknowledgementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1#mmPotentialLossAcknowledgementIndicator
 * CorporateActionAcknowledgementSD1.mmPotentialLossAcknowledgementIndicator}</li>
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
 * "CorporateActionAcknowledgementSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acknowledgement information relative to corporate action reorganisation instructions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionAcknowledgementSD1", propOrder = {"termsAcknowledgementIndicator", "condition1Indicator", "condition2Indicator", "condition3Indicator", "condition4Indicator", "condition5Indicator", "condition6Indicator",
		"adjudicationOfIncompetencyAcknowledgementIndicator", "legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator", "instructionDeletionAcknowledgementIndicator", "potentialLossAcknowledgementIndicator"})
public class CorporateActionAcknowledgementSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TermsAckInd")
	protected YesNoIndicator termsAcknowledgementIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermsAckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TermsAcknowledgementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the participant agrees to all terms of the event.\r\nYes: the participant agrees.\r\nNo: the participant does not agree."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmTermsAcknowledgementIndicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "TermsAckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TermsAcknowledgementIndicator";
			definition = "Indicates whether the participant agrees to all terms of the event.\r\nYes: the participant agrees.\r\nNo: the participant does not agree.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getTermsAcknowledgementIndicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setTermsAcknowledgementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond1Ind")
	protected YesNoIndicator condition1Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond1Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 1 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition1Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond1Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1Indicator";
			definition = "Indicates whether condition 1 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition1Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition1Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond2Ind")
	protected YesNoIndicator condition2Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond2Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 2 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition2Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond2Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2Indicator";
			definition = "Indicates whether condition 2 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition2Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition2Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond3Ind")
	protected YesNoIndicator condition3Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond3Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 3 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition3Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond3Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3Indicator";
			definition = "Indicates whether condition 3 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition3Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition3Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond4Ind")
	protected YesNoIndicator condition4Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond4Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 4 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition4Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond4Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4Indicator";
			definition = "Indicates whether condition 4 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition4Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition4Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond5Ind")
	protected YesNoIndicator condition5Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond5Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 5 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition5Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond5Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5Indicator";
			definition = "Indicates whether condition 5 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition5Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition5Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond6Ind")
	protected YesNoIndicator condition6Indicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond6Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether condition 6 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmCondition6Indicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "Cond6Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6Indicator";
			definition = "Indicates whether condition 6 of this tender offer is being accepted.\r\nYes: accept.\r\nNo: decline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getCondition6Indicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setCondition6Indicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjdctnOfIncmptncyAckInd")
	protected YesNoIndicator adjudicationOfIncompetencyAcknowledgementIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjdctnOfIncmptncyAckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjudicationOfIncompetencyAcknowledgementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is an acknowledgement that the beneficial owner has been deemed incompetent. Acknowledgement is related to CD early redemption instructions.\r\nYes: acknowledged.\r\nNo: not acknowledged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmAdjudicationOfIncompetencyAcknowledgementIndicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "AdjdctnOfIncmptncyAckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjudicationOfIncompetencyAcknowledgementIndicator";
			definition = "Indicates whether there is an acknowledgement that the beneficial owner has been deemed incompetent. Acknowledgement is related to CD early redemption instructions.\r\nYes: acknowledged.\r\nNo: not acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getAdjudicationOfIncompetencyAcknowledgementIndicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setAdjudicationOfIncompetencyAcknowledgementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LglDcmnttnThrtyMnthsRtntnAckInd")
	protected YesNoIndicator legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglDcmnttnThrtyMnthsRtntnAckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is an acknowledgement that this CD Early Redemption request is an exempt request, that the identification of the beneficial owner and required legal documentation is correct and that you agree to maintain such documentation for at least 30 months following payment of the request and will make it available to the CD Issuer upon request. \r\nYes: acknowledged.\r\nNo: not acknowledged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "LglDcmnttnThrtyMnthsRtntnAckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator";
			definition = "Indicates whether there is an acknowledgement that this CD Early Redemption request is an exempt request, that the identification of the beneficial owner and required legal documentation is correct and that you agree to maintain such documentation for at least 30 months following payment of the request and will make it available to the CD Issuer upon request. \r\nYes: acknowledged.\r\nNo: not acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrDeltnAckInd")
	protected YesNoIndicator instructionDeletionAcknowledgementIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrDeltnAckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDeletionAcknowledgementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is an acknowledgement that this CD Early Redemption instruction will automatically be deleted by the close of the fifth business day subsequent to submission if the appropriate legal documents, for example, death certificate, affidavit of domicile, are not received by DTC at that time. \r\nYes: acknowledged.\r\nNo: not acknowledged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmInstructionDeletionAcknowledgementIndicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "InstrDeltnAckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDeletionAcknowledgementIndicator";
			definition = "Indicates whether there is an acknowledgement that this CD Early Redemption instruction will automatically be deleted by the close of the fifth business day subsequent to submission if the appropriate legal documents, for example, death certificate, affidavit of domicile, are not received by DTC at that time. \r\nYes: acknowledged.\r\nNo: not acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getInstructionDeletionAcknowledgementIndicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setInstructionDeletionAcknowledgementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PotntlLossAckInd")
	protected YesNoIndicator potentialLossAcknowledgementIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PotntlLossAckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentialLossAcknowledgementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is an acknowledgement that the warrant or conversion instruction being sent could lead to a potential loss due to pricing factors.\r\nYes: acknowledged.\r\nNo: not acknowledged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>> mmPotentialLossAcknowledgementIndicator = new MMMessageAttribute<CorporateActionAcknowledgementSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
			isDerived = false;
			xmlTag = "PotntlLossAckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialLossAcknowledgementIndicator";
			definition = "Indicates whether there is an acknowledgement that the warrant or conversion instruction being sent could lead to a potential loss due to pricing factors.\r\nYes: acknowledged.\r\nNo: not acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionAcknowledgementSD1 obj) {
			return obj.getPotentialLossAcknowledgementIndicator();
		}

		@Override
		public void setValue(CorporateActionAcknowledgementSD1 obj, Optional<YesNoIndicator> value) {
			obj.setPotentialLossAcknowledgementIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmTermsAcknowledgementIndicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition1Indicator, com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition2Indicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition3Indicator, com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition4Indicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition5Indicator, com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmCondition6Indicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmAdjudicationOfIncompetencyAcknowledgementIndicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator,
						com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmInstructionDeletionAcknowledgementIndicator, com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmPotentialLossAcknowledgementIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionAcknowledgementSD1";
				definition = "Acknowledgement information relative to corporate action reorganisation instructions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getTermsAcknowledgementIndicator() {
		return termsAcknowledgementIndicator == null ? Optional.empty() : Optional.of(termsAcknowledgementIndicator);
	}

	public CorporateActionAcknowledgementSD1 setTermsAcknowledgementIndicator(YesNoIndicator termsAcknowledgementIndicator) {
		this.termsAcknowledgementIndicator = termsAcknowledgementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition1Indicator() {
		return condition1Indicator == null ? Optional.empty() : Optional.of(condition1Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition1Indicator(YesNoIndicator condition1Indicator) {
		this.condition1Indicator = condition1Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition2Indicator() {
		return condition2Indicator == null ? Optional.empty() : Optional.of(condition2Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition2Indicator(YesNoIndicator condition2Indicator) {
		this.condition2Indicator = condition2Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition3Indicator() {
		return condition3Indicator == null ? Optional.empty() : Optional.of(condition3Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition3Indicator(YesNoIndicator condition3Indicator) {
		this.condition3Indicator = condition3Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition4Indicator() {
		return condition4Indicator == null ? Optional.empty() : Optional.of(condition4Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition4Indicator(YesNoIndicator condition4Indicator) {
		this.condition4Indicator = condition4Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition5Indicator() {
		return condition5Indicator == null ? Optional.empty() : Optional.of(condition5Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition5Indicator(YesNoIndicator condition5Indicator) {
		this.condition5Indicator = condition5Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getCondition6Indicator() {
		return condition6Indicator == null ? Optional.empty() : Optional.of(condition6Indicator);
	}

	public CorporateActionAcknowledgementSD1 setCondition6Indicator(YesNoIndicator condition6Indicator) {
		this.condition6Indicator = condition6Indicator;
		return this;
	}

	public Optional<YesNoIndicator> getAdjudicationOfIncompetencyAcknowledgementIndicator() {
		return adjudicationOfIncompetencyAcknowledgementIndicator == null ? Optional.empty() : Optional.of(adjudicationOfIncompetencyAcknowledgementIndicator);
	}

	public CorporateActionAcknowledgementSD1 setAdjudicationOfIncompetencyAcknowledgementIndicator(YesNoIndicator adjudicationOfIncompetencyAcknowledgementIndicator) {
		this.adjudicationOfIncompetencyAcknowledgementIndicator = adjudicationOfIncompetencyAcknowledgementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator() {
		return legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator == null ? Optional.empty() : Optional.of(legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator);
	}

	public CorporateActionAcknowledgementSD1 setLegalDocumentationThirtyMonthsRetentionAcknowledgementIndicator(YesNoIndicator legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator) {
		this.legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator = legalDocumentationThirtyMonthsRetentionAcknowledgementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getInstructionDeletionAcknowledgementIndicator() {
		return instructionDeletionAcknowledgementIndicator == null ? Optional.empty() : Optional.of(instructionDeletionAcknowledgementIndicator);
	}

	public CorporateActionAcknowledgementSD1 setInstructionDeletionAcknowledgementIndicator(YesNoIndicator instructionDeletionAcknowledgementIndicator) {
		this.instructionDeletionAcknowledgementIndicator = instructionDeletionAcknowledgementIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPotentialLossAcknowledgementIndicator() {
		return potentialLossAcknowledgementIndicator == null ? Optional.empty() : Optional.of(potentialLossAcknowledgementIndicator);
	}

	public CorporateActionAcknowledgementSD1 setPotentialLossAcknowledgementIndicator(YesNoIndicator potentialLossAcknowledgementIndicator) {
		this.potentialLossAcknowledgementIndicator = potentialLossAcknowledgementIndicator;
		return this;
	}
}