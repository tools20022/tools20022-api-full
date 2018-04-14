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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Expiry;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AutoExtension1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Expiry conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpiryTerms1#mmDateTime
 * ExpiryTerms1.mmDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpiryTerms1#mmAutoExtension
 * ExpiryTerms1.mmAutoExtension}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpiryTerms1#mmCondition
 * ExpiryTerms1.mmCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1#mmOpenEndedIndicator
 * ExpiryTerms1.mmOpenEndedIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpiryTerms1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expiry conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateTimeAndCondition1Rule#forExpiryTerms1
 * ConstraintDateTimeAndCondition1Rule.forExpiryTerms1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateTimeAndCondition2Rule#forExpiryTerms1
 * ConstraintDateTimeAndCondition2Rule.forExpiryTerms1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOpenEnded1Rule#forExpiryTerms1
 * ConstraintOpenEnded1Rule.forExpiryTerms1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateTimeAndCondition3Rule#forExpiryTerms1
 * ConstraintDateTimeAndCondition3Rule.forExpiryTerms1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateTimeAndCondition4Rule#forExpiryTerms1
 * ConstraintDateTimeAndCondition4Rule.forExpiryTerms1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExpiryTerms1", propOrder = {"dateTime", "autoExtension", "condition", "openEndedIndicator"})
public class ExpiryTerms1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtTm")
	protected DateAndDateTimeChoice dateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmExpiryDateTime
	 * Expiry.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1 ExpiryTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when the undertaking will cease to be available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpiryTerms1, Optional<DateAndDateTimeChoice>> mmDateTime = new MMMessageAttribute<ExpiryTerms1, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Expiry.mmExpiryDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryTerms1.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Date and time when the undertaking will cease to be available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(ExpiryTerms1 obj) {
			return obj.getDateTime();
		}

		@Override
		public void setValue(ExpiryTerms1 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "AutoXtnsn")
	protected AutoExtension1 autoExtension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AutoExtension1
	 * AutoExtension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingExtension
	 * Undertaking.mmUndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1 ExpiryTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutoXtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the automatic extension of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExpiryTerms1, Optional<AutoExtension1>> mmAutoExtension = new MMMessageAssociationEnd<ExpiryTerms1, Optional<AutoExtension1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingExtension;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryTerms1.mmObject();
			isDerived = false;
			xmlTag = "AutoXtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoExtension";
			definition = "Details related to the automatic extension of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutoExtension1.mmObject();
		}

		@Override
		public Optional<AutoExtension1> getValue(ExpiryTerms1 obj) {
			return obj.getAutoExtension();
		}

		@Override
		public void setValue(ExpiryTerms1 obj, Optional<AutoExtension1> value) {
			obj.setAutoExtension(value.orElse(null));
		}
	};
	@XmlElement(name = "Cond")
	protected Max2000Text condition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmExpiryCondition
	 * Expiry.mmExpiryCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1 ExpiryTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documentary condition that indicates when the undertaking will cease to be available."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpiryTerms1, Optional<Max2000Text>> mmCondition = new MMMessageAttribute<ExpiryTerms1, Optional<Max2000Text>>() {
		{
			businessElementTrace_lazy = () -> Expiry.mmExpiryCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryTerms1.mmObject();
			isDerived = false;
			xmlTag = "Cond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition";
			definition = "Documentary condition that indicates when the undertaking will cease to be available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(ExpiryTerms1 obj) {
			return obj.getCondition();
		}

		@Override
		public void setValue(ExpiryTerms1 obj, Optional<Max2000Text> value) {
			obj.setCondition(value.orElse(null));
		}
	};
	@XmlElement(name = "OpnEnddInd")
	protected YesNoIndicator openEndedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmOpenEndedIndicator
	 * Expiry.mmOpenEndedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1 ExpiryTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpnEnddInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenEndedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the expiry terms are without a fixed expiry date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpiryTerms1, Optional<YesNoIndicator>> mmOpenEndedIndicator = new MMMessageAttribute<ExpiryTerms1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Expiry.mmOpenEndedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryTerms1.mmObject();
			isDerived = false;
			xmlTag = "OpnEnddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenEndedIndicator";
			definition = "Indicates whether the expiry terms are without a fixed expiry date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ExpiryTerms1 obj) {
			return obj.getOpenEndedIndicator();
		}

		@Override
		public void setValue(ExpiryTerms1 obj, Optional<YesNoIndicator> value) {
			obj.setOpenEndedIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpiryTerms1.mmDateTime, com.tools20022.repository.msg.ExpiryTerms1.mmAutoExtension, com.tools20022.repository.msg.ExpiryTerms1.mmCondition,
						com.tools20022.repository.msg.ExpiryTerms1.mmOpenEndedIndicator);
				trace_lazy = () -> Expiry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDateTimeAndCondition1Rule.forExpiryTerms1, com.tools20022.repository.constraints.ConstraintDateTimeAndCondition2Rule.forExpiryTerms1,
						com.tools20022.repository.constraints.ConstraintOpenEnded1Rule.forExpiryTerms1, com.tools20022.repository.constraints.ConstraintDateTimeAndCondition3Rule.forExpiryTerms1,
						com.tools20022.repository.constraints.ConstraintDateTimeAndCondition4Rule.forExpiryTerms1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpiryTerms1";
				definition = "Expiry conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateAndDateTimeChoice> getDateTime() {
		return dateTime == null ? Optional.empty() : Optional.of(dateTime);
	}

	public ExpiryTerms1 setDateTime(DateAndDateTimeChoice dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public Optional<AutoExtension1> getAutoExtension() {
		return autoExtension == null ? Optional.empty() : Optional.of(autoExtension);
	}

	public ExpiryTerms1 setAutoExtension(AutoExtension1 autoExtension) {
		this.autoExtension = autoExtension;
		return this;
	}

	public Optional<Max2000Text> getCondition() {
		return condition == null ? Optional.empty() : Optional.of(condition);
	}

	public ExpiryTerms1 setCondition(Max2000Text condition) {
		this.condition = condition;
		return this;
	}

	public Optional<YesNoIndicator> getOpenEndedIndicator() {
		return openEndedIndicator == null ? Optional.empty() : Optional.of(openEndedIndicator);
	}

	public ExpiryTerms1 setOpenEndedIndicator(YesNoIndicator openEndedIndicator) {
		this.openEndedIndicator = openEndedIndicator;
		return this;
	}
}