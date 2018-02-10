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
import com.tools20022.repository.choice.DerivativePartyIdentification1Choice;
import com.tools20022.repository.choice.InterestComputationMethodFormat6Choice;
import com.tools20022.repository.choice.TrancheIndicator2Choice;
import com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code;
import com.tools20022.repository.codeset.Frequency8Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related specifically to credit derivatives attributes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDerivative3#mmSeniority
 * CreditDerivative3.mmSeniority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDerivative3#mmReferenceParty
 * CreditDerivative3.mmReferenceParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDerivative3#mmPaymentFrequency
 * CreditDerivative3.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDerivative3#mmDayCountBasis
 * CreditDerivative3.mmDayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDerivative3#mmSeries
 * CreditDerivative3.mmSeries}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDerivative3#mmVersion
 * CreditDerivative3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDerivative3#mmIndexFactor
 * CreditDerivative3.mmIndexFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDerivative3#mmTranche
 * CreditDerivative3.mmTranche}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
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
 * "CreditDerivative3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related specifically to credit derivatives attributes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditDerivative3", propOrder = {"seniority", "referenceParty", "paymentFrequency", "dayCountBasis", "series", "version", "indexFactor", "tranche"})
public class CreditDerivative3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Snrty")
	protected DebtInstrumentSeniorityType2Code seniority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code
	 * DebtInstrumentSeniorityType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Snrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seniority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of seniority in case of contract on index or on a single name entity.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeniority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Snrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seniority";
			definition = "Classification of seniority in case of contract on index or on a single name entity.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DebtInstrumentSeniorityType2Code.mmObject();
		}
	};
	@XmlElement(name = "RefPty")
	protected DerivativePartyIdentification1Choice referenceParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
	 * DerivativePartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetPartyRole
	 * Asset.mmAssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Designation of the underlying reference obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferenceParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "RefPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceParty";
			definition = "Designation of the underlying reference obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency8Code paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency8Code
	 * Frequency8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
	 * InterestCalculation.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of payment of the interest rate or coupon."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Frequency of payment of the interest rate or coupon.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency8Code.mmObject();
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethodFormat6Choice dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat6Choice
	 * InterestComputationMethodFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation basis of the interest rate, such as Act/360."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDayCountBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Calculation basis of the interest rate, such as Act/360.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "Srs")
	protected Number series;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Srs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the series number of the composition of the index if applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeries = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Srs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Series";
			definition = "Indicates the series number of the composition of the index if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New version of a series is issued if one of the constituents defaults and the index has to be re-weighted to account for the new number of total constituents within the index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "New version of a series is issued if one of the constituents defaults and the index has to be re-weighted to account for the new number of total constituents within the index.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "IndxFctr")
	protected PercentageRate indexFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor to apply to the actual notional to adjust it to all the previous credit events in the index series. \r\n\r\nUsage: The figure varies between 0 and 100.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Factor to apply to the actual notional to adjust it to all the previous credit events in the index series. \r\n\r\nUsage: The figure varies between 0 and 100.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "Trch")
	protected TrancheIndicator2Choice tranche;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TrancheIndicator2Choice
	 * TrancheIndicator2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmTranche
	 * Asset.mmTranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative contract is tranched or not."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTranche = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmTranche;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Trch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "Indicates whether the derivative contract is tranched or not.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TrancheIndicator2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDerivative3.mmSeniority, com.tools20022.repository.msg.CreditDerivative3.mmReferenceParty,
						com.tools20022.repository.msg.CreditDerivative3.mmPaymentFrequency, com.tools20022.repository.msg.CreditDerivative3.mmDayCountBasis, com.tools20022.repository.msg.CreditDerivative3.mmSeries,
						com.tools20022.repository.msg.CreditDerivative3.mmVersion, com.tools20022.repository.msg.CreditDerivative3.mmIndexFactor, com.tools20022.repository.msg.CreditDerivative3.mmTranche);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CreditDerivative3";
				definition = "Information related specifically to credit derivatives attributes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DebtInstrumentSeniorityType2Code> getSeniority() {
		return seniority == null ? Optional.empty() : Optional.of(seniority);
	}

	public CreditDerivative3 setSeniority(DebtInstrumentSeniorityType2Code seniority) {
		this.seniority = seniority;
		return this;
	}

	public Optional<DerivativePartyIdentification1Choice> getReferenceParty() {
		return referenceParty == null ? Optional.empty() : Optional.of(referenceParty);
	}

	public CreditDerivative3 setReferenceParty(DerivativePartyIdentification1Choice referenceParty) {
		this.referenceParty = referenceParty;
		return this;
	}

	public Optional<Frequency8Code> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public CreditDerivative3 setPaymentFrequency(Frequency8Code paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<InterestComputationMethodFormat6Choice> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public CreditDerivative3 setDayCountBasis(InterestComputationMethodFormat6Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<Number> getSeries() {
		return series == null ? Optional.empty() : Optional.of(series);
	}

	public CreditDerivative3 setSeries(Number series) {
		this.series = series;
		return this;
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public CreditDerivative3 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Optional<PercentageRate> getIndexFactor() {
		return indexFactor == null ? Optional.empty() : Optional.of(indexFactor);
	}

	public CreditDerivative3 setIndexFactor(PercentageRate indexFactor) {
		this.indexFactor = indexFactor;
		return this;
	}

	public Optional<TrancheIndicator2Choice> getTranche() {
		return tranche == null ? Optional.empty() : Optional.of(tranche);
	}

	public CreditDerivative3 setTranche(TrancheIndicator2Choice tranche) {
		this.tranche = tranche;
		return this;
	}
}