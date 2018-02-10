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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.TaxationBasis2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information used to calculate the tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#BasisOrExtendedBasisRule
 * TaxCalculationInformation6.BasisOrExtendedBasisRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmBasis
 * TaxCalculationInformation6.mmBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmExtendedBasis
 * TaxCalculationInformation6.mmExtendedBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmTaxableAmount
 * TaxCalculationInformation6.mmTaxableAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxCalculationInformation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to calculate the tax."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxCalculationInformation6", propOrder = {"basis", "extendedBasis", "taxableAmount"})
public class TaxCalculationInformation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bsis")
	protected TaxationBasis2Code basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis2Code
	 * TaxationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
	 * TaxCalculationInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation6.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxationBasis2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedBsis")
	protected Extended350Code extendedBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
	 * TaxCalculationInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation6.mmObject();
			isDerived = false;
			xmlTag = "XtndedBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedBasis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "TaxblAmt")
	protected ActiveCurrencyAnd13DecimalAmount taxableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
	 * TaxCalculationInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that it is to be taxed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation6.mmObject();
			isDerived = false;
			xmlTag = "TaxblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableAmount";
			definition = "Amount of money that it is to be taxed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	/**
	 * Either Basis or ExtendedBasis may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
	 * TaxCalculationInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmBasis
	 * TaxCalculationInformation6.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmExtendedBasis
	 * TaxCalculationInformation6.mmExtendedBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisOrExtendedBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Basis or ExtendedBasis may be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor BasisOrExtendedBasisRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisOrExtendedBasisRule";
			definition = "Either Basis or ExtendedBasis may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation6.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation6.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation6.mmExtendedBasis);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation6.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation6.mmExtendedBasis,
						com.tools20022.repository.msg.TaxCalculationInformation6.mmTaxableAmount);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TaxCalculationInformation6";
				definition = "Information used to calculate the tax.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation6.BasisOrExtendedBasisRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TaxationBasis2Code> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public TaxCalculationInformation6 setBasis(TaxationBasis2Code basis) {
		this.basis = basis;
		return this;
	}

	public Optional<Extended350Code> getExtendedBasis() {
		return extendedBasis == null ? Optional.empty() : Optional.of(extendedBasis);
	}

	public TaxCalculationInformation6 setExtendedBasis(Extended350Code extendedBasis) {
		this.extendedBasis = extendedBasis;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getTaxableAmount() {
		return taxableAmount == null ? Optional.empty() : Optional.of(taxableAmount);
	}

	public TaxCalculationInformation6 setTaxableAmount(ActiveCurrencyAnd13DecimalAmount taxableAmount) {
		this.taxableAmount = taxableAmount;
		return this;
	}
}