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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the security option of a corporate event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmConditionalQuantity
 * SecuritiesOption2.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmOverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesOption2.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmInstructedOrQuantityToReceive
 * SecuritiesOption2.mmInstructedOrQuantityToReceive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOverAndAboveQuantityGuideline#forSecuritiesOption2
 * ConstraintOverAndAboveQuantityGuideline.forSecuritiesOption2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption2
 * ConstraintCoexistenceQuantityRule.forSecuritiesOption2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the security option of a corporate event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption52
 * SecuritiesOption52}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOption2", propOrder = {"conditionalQuantity", "overAndAboveNormalEnsuredEntitlementQuantity", "instructedOrQuantityToReceive"})
public class SecuritiesOption2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CondlQty")
	protected FinancialInstrumentQuantity1Choice conditionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
	 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
	 * SecuritiesOption2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::COND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmConditionalQuantity
	 * SecuritiesOption52.mmConditionalQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption2, Optional<FinancialInstrumentQuantity1Choice>> mmConditionalQuantity = new MMMessageAttribute<SecuritiesOption2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmConditionalQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption2.mmObject();
			isDerived = false;
			xmlTag = "CondlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::COND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption52.mmConditionalQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(SecuritiesOption2 obj) {
			return obj.getConditionalQuantity();
		}

		@Override
		public void setValue(SecuritiesOption2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setConditionalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "OverAndAbovNrmlNsrdEntitlmntQty")
	protected FinancialInstrumentQuantity1Choice overAndAboveNormalEnsuredEntitlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesProceedsDefinition.
	 * mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
	 * SecuritiesOption2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverAndAbovNrmlNsrdEntitlmntQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::QOVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveNormalEnsuredEntitlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed to be received over and above normal ensured entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption2, Optional<FinancialInstrumentQuantity1Choice>> mmOverAndAboveNormalEnsuredEntitlementQuantity = new MMMessageAttribute<SecuritiesOption2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption2.mmObject();
			isDerived = false;
			xmlTag = "OverAndAbovNrmlNsrdEntitlmntQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::QOVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAboveNormalEnsuredEntitlementQuantity";
			definition = "Quantity instructed to be received over and above normal ensured entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(SecuritiesOption2 obj) {
			return obj.getOverAndAboveNormalEnsuredEntitlementQuantity();
		}

		@Override
		public void setValue(SecuritiesOption2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setOverAndAboveNormalEnsuredEntitlementQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdOrQtyToRcv", required = true)
	protected InstructedOrQuantityToReceive1Choice instructedOrQuantityToReceive;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice
	 * InstructedOrQuantityToReceive1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
	 * SecuritiesOption2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdOrQtyToRcv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a::QINS or QREC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedOrQuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the quantity of financial instrument is a quantity of securities instructed or a quantity to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption2, InstructedOrQuantityToReceive1Choice> mmInstructedOrQuantityToReceive = new MMMessageAssociationEnd<SecuritiesOption2, InstructedOrQuantityToReceive1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption2.mmObject();
			isDerived = false;
			xmlTag = "InstdOrQtyToRcv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::QINS or QREC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedOrQuantityToReceive";
			definition = "Specifies whether the quantity of financial instrument is a quantity of securities instructed or a quantity to receive.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructedOrQuantityToReceive1Choice.mmObject();
		}

		@Override
		public InstructedOrQuantityToReceive1Choice getValue(SecuritiesOption2 obj) {
			return obj.getInstructedOrQuantityToReceive();
		}

		@Override
		public void setValue(SecuritiesOption2 obj, InstructedOrQuantityToReceive1Choice value) {
			obj.setInstructedOrQuantityToReceive(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption2.mmConditionalQuantity, com.tools20022.repository.msg.SecuritiesOption2.mmOverAndAboveNormalEnsuredEntitlementQuantity,
						com.tools20022.repository.msg.SecuritiesOption2.mmInstructedOrQuantityToReceive);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOverAndAboveQuantityGuideline.forSecuritiesOption2,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesOption2";
				definition = "Specifies the security option of a corporate event.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOption52.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConditionalQuantity() {
		return conditionalQuantity == null ? Optional.empty() : Optional.of(conditionalQuantity);
	}

	public SecuritiesOption2 setConditionalQuantity(FinancialInstrumentQuantity1Choice conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getOverAndAboveNormalEnsuredEntitlementQuantity() {
		return overAndAboveNormalEnsuredEntitlementQuantity == null ? Optional.empty() : Optional.of(overAndAboveNormalEnsuredEntitlementQuantity);
	}

	public SecuritiesOption2 setOverAndAboveNormalEnsuredEntitlementQuantity(FinancialInstrumentQuantity1Choice overAndAboveNormalEnsuredEntitlementQuantity) {
		this.overAndAboveNormalEnsuredEntitlementQuantity = overAndAboveNormalEnsuredEntitlementQuantity;
		return this;
	}

	public InstructedOrQuantityToReceive1Choice getInstructedOrQuantityToReceive() {
		return instructedOrQuantityToReceive;
	}

	public SecuritiesOption2 setInstructedOrQuantityToReceive(InstructedOrQuantityToReceive1Choice instructedOrQuantityToReceive) {
		this.instructedOrQuantityToReceive = Objects.requireNonNull(instructedOrQuantityToReceive);
		return this;
	}
}