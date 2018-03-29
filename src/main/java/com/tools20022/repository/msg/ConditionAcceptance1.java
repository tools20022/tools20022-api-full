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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max1NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides acceptance marker to the identified conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionAcceptance1#mmConditionIdentification
 * ConditionAcceptance1.mmConditionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionAcceptance1#mmAcceptanceFlag
 * ConditionAcceptance1.mmAcceptanceFlag}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionAcceptance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides acceptance marker to the identified conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConditionAcceptance1", propOrder = {"conditionIdentification", "acceptanceFlag"})
public class ConditionAcceptance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CondId", required = true)
	protected Max1NumericText conditionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max1NumericText
	 * Max1NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConditionAcceptance1
	 * ConditionAcceptance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Condition Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the condition number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConditionAcceptance1, Max1NumericText> mmConditionIdentification = new MMMessageAttribute<ConditionAcceptance1, Max1NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConditionAcceptance1.mmObject();
			isDerived = false;
			xmlTag = "CondId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Condition Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionIdentification";
			definition = "Identification of the condition number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max1NumericText.mmObject();
		}

		@Override
		public Max1NumericText getValue(ConditionAcceptance1 obj) {
			return obj.getConditionIdentification();
		}

		@Override
		public void setValue(ConditionAcceptance1 obj, Max1NumericText value) {
			obj.setConditionIdentification(value);
		}
	};
	@XmlElement(name = "AccptncFlg", required = true)
	protected YesNoIndicator acceptanceFlag;
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
	 * {@linkplain com.tools20022.repository.msg.ConditionAcceptance1
	 * ConditionAcceptance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptncFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Acceptance Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the condition is accepted or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConditionAcceptance1, YesNoIndicator> mmAcceptanceFlag = new MMMessageAttribute<ConditionAcceptance1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConditionAcceptance1.mmObject();
			isDerived = false;
			xmlTag = "AccptncFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Acceptance Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceFlag";
			definition = "Indicates whether the condition is accepted or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ConditionAcceptance1 obj) {
			return obj.getAcceptanceFlag();
		}

		@Override
		public void setValue(ConditionAcceptance1 obj, YesNoIndicator value) {
			obj.setAcceptanceFlag(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConditionAcceptance1.mmConditionIdentification, com.tools20022.repository.msg.ConditionAcceptance1.mmAcceptanceFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ConditionAcceptance1";
				definition = "Provides acceptance marker to the identified conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max1NumericText getConditionIdentification() {
		return conditionIdentification;
	}

	public ConditionAcceptance1 setConditionIdentification(Max1NumericText conditionIdentification) {
		this.conditionIdentification = Objects.requireNonNull(conditionIdentification);
		return this;
	}

	public YesNoIndicator getAcceptanceFlag() {
		return acceptanceFlag;
	}

	public ConditionAcceptance1 setAcceptanceFlag(YesNoIndicator acceptanceFlag) {
		this.acceptanceFlag = Objects.requireNonNull(acceptanceFlag);
		return this;
	}
}