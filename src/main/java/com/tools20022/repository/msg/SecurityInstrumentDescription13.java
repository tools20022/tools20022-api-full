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
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DebtInstrument4;
import com.tools20022.repository.msg.DerivativeInstrument6;
import com.tools20022.repository.msg.SecurityInstrumentDescription11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the security instrument by its name and typical characteristics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmFinancialInstrumentGeneralAttributes
 * SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmDebtInstrumentAttributes
 * SecurityInstrumentDescription13.mmDebtInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmDerivativeInstrumentAttributes
 * SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
 * "SecurityInstrumentDescription13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the security instrument by its name and typical characteristics."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityInstrumentDescription13", propOrder = {"financialInstrumentGeneralAttributes", "debtInstrumentAttributes", "derivativeInstrumentAttributes"})
public class SecurityInstrumentDescription13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmGnlAttrbts", required = true)
	protected SecurityInstrumentDescription11 financialInstrumentGeneralAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
	 * SecurityInstrumentDescription11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13
	 * SecurityInstrumentDescription13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmGnlAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentGeneralAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attributes and characteristics of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityInstrumentDescription13, SecurityInstrumentDescription11> mmFinancialInstrumentGeneralAttributes = new MMMessageAssociationEnd<SecurityInstrumentDescription13, SecurityInstrumentDescription11>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityInstrumentDescription13.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmGnlAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentGeneralAttributes";
			definition = "Attributes and characteristics of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityInstrumentDescription11.mmObject();
		}

		@Override
		public SecurityInstrumentDescription11 getValue(SecurityInstrumentDescription13 obj) {
			return obj.getFinancialInstrumentGeneralAttributes();
		}

		@Override
		public void setValue(SecurityInstrumentDescription13 obj, SecurityInstrumentDescription11 value) {
			obj.setFinancialInstrumentGeneralAttributes(value);
		}
	};
	@XmlElement(name = "DebtInstrmAttrbts")
	protected DebtInstrument4 debtInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DebtInstrument4
	 * DebtInstrument4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13
	 * SecurityInstrumentDescription13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DebtInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes specific to debt instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityInstrumentDescription13, Optional<DebtInstrument4>> mmDebtInstrumentAttributes = new MMMessageAssociationEnd<SecurityInstrumentDescription13, Optional<DebtInstrument4>>() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityInstrumentDescription13.mmObject();
			isDerived = false;
			xmlTag = "DebtInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtInstrumentAttributes";
			definition = "Attributes specific to debt instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DebtInstrument4.mmObject();
		}

		@Override
		public Optional<DebtInstrument4> getValue(SecurityInstrumentDescription13 obj) {
			return obj.getDebtInstrumentAttributes();
		}

		@Override
		public void setValue(SecurityInstrumentDescription13 obj, Optional<DebtInstrument4> value) {
			obj.setDebtInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivInstrmAttrbts", required = true)
	protected DerivativeInstrument6 derivativeInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13
	 * SecurityInstrumentDescription13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes specific to derivative instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityInstrumentDescription13, DerivativeInstrument6> mmDerivativeInstrumentAttributes = new MMMessageAssociationEnd<SecurityInstrumentDescription13, DerivativeInstrument6>() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityInstrumentDescription13.mmObject();
			isDerived = false;
			xmlTag = "DerivInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeInstrumentAttributes";
			definition = "Attributes specific to derivative instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DerivativeInstrument6.mmObject();
		}

		@Override
		public DerivativeInstrument6 getValue(SecurityInstrumentDescription13 obj) {
			return obj.getDerivativeInstrumentAttributes();
		}

		@Override
		public void setValue(SecurityInstrumentDescription13 obj, DerivativeInstrument6 value) {
			obj.setDerivativeInstrumentAttributes(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityInstrumentDescription13.mmFinancialInstrumentGeneralAttributes,
						com.tools20022.repository.msg.SecurityInstrumentDescription13.mmDebtInstrumentAttributes, com.tools20022.repository.msg.SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityInstrumentDescription13";
				definition = "Identifies the security instrument by its name and typical characteristics.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityInstrumentDescription11 getFinancialInstrumentGeneralAttributes() {
		return financialInstrumentGeneralAttributes;
	}

	public SecurityInstrumentDescription13 setFinancialInstrumentGeneralAttributes(SecurityInstrumentDescription11 financialInstrumentGeneralAttributes) {
		this.financialInstrumentGeneralAttributes = Objects.requireNonNull(financialInstrumentGeneralAttributes);
		return this;
	}

	public Optional<DebtInstrument4> getDebtInstrumentAttributes() {
		return debtInstrumentAttributes == null ? Optional.empty() : Optional.of(debtInstrumentAttributes);
	}

	public SecurityInstrumentDescription13 setDebtInstrumentAttributes(DebtInstrument4 debtInstrumentAttributes) {
		this.debtInstrumentAttributes = debtInstrumentAttributes;
		return this;
	}

	public DerivativeInstrument6 getDerivativeInstrumentAttributes() {
		return derivativeInstrumentAttributes;
	}

	public SecurityInstrumentDescription13 setDerivativeInstrumentAttributes(DerivativeInstrument6 derivativeInstrumentAttributes) {
		this.derivativeInstrumentAttributes = Objects.requireNonNull(derivativeInstrumentAttributes);
		return this;
	}
}