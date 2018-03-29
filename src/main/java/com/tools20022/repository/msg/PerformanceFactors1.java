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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.PerformanceFactors;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Performance factors of the investment fund / fund class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1#mmCorporateActionFactor
 * PerformanceFactors1.mmCorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1#mmCumulativeCorporateActionFactor
 * PerformanceFactors1.mmCumulativeCorporateActionFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1#mmAccumulationPeriod
 * PerformanceFactors1.mmAccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1#mmNormalPerformance
 * PerformanceFactors1.mmNormalPerformance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PerformanceFactors
 * PerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccumulationPeriodRule#forPerformanceFactors1
 * ConstraintAccumulationPeriodRule.forPerformanceFactors1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PerformanceFactors1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Performance factors of the investment fund / fund class."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PerformanceFactors1", propOrder = {"corporateActionFactor", "cumulativeCorporateActionFactor", "accumulationPeriod", "normalPerformance"})
public class PerformanceFactors1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CorpActnFctr")
	protected DecimalNumber corporateActionFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmCorporateActionFactor
	 * PerformanceFactors.mmCorporateActionFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1
	 * PerformanceFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>> mmCorporateActionFactor = new MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> PerformanceFactors.mmCorporateActionFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.PerformanceFactors1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionFactor";
			definition = "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(PerformanceFactors1 obj) {
			return obj.getCorporateActionFactor();
		}

		@Override
		public void setValue(PerformanceFactors1 obj, Optional<DecimalNumber> value) {
			obj.setCorporateActionFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "CmltvCorpActnFctr")
	protected DecimalNumber cumulativeCorporateActionFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmCumulativeCorporateActionFactor
	 * PerformanceFactors.mmCumulativeCorporateActionFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1
	 * PerformanceFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmltvCorpActnFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeCorporateActionFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>> mmCumulativeCorporateActionFactor = new MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> PerformanceFactors.mmCumulativeCorporateActionFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.PerformanceFactors1.mmObject();
			isDerived = false;
			xmlTag = "CmltvCorpActnFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeCorporateActionFactor";
			definition = "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(PerformanceFactors1 obj) {
			return obj.getCumulativeCorporateActionFactor();
		}

		@Override
		public void setValue(PerformanceFactors1 obj, Optional<DecimalNumber> value) {
			obj.setCumulativeCorporateActionFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "AcmltnPrd")
	protected DatePeriodDetails accumulationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
	 * PerformanceFactors.mmAccumulationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1
	 * PerformanceFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period of time for the calculation of the cumulative corporate action factor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PerformanceFactors1, Optional<DatePeriodDetails>> mmAccumulationPeriod = new MMMessageAttribute<PerformanceFactors1, Optional<DatePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> PerformanceFactors.mmAccumulationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PerformanceFactors1.mmObject();
			isDerived = false;
			xmlTag = "AcmltnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationPeriod";
			definition = "Period of time for the calculation of the cumulative corporate action factor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public Optional<DatePeriodDetails> getValue(PerformanceFactors1 obj) {
			return obj.getAccumulationPeriod();
		}

		@Override
		public void setValue(PerformanceFactors1 obj, Optional<DatePeriodDetails> value) {
			obj.setAccumulationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "NrmlPrfrmnc")
	protected DecimalNumber normalPerformance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNormalPerformance
	 * PerformanceFactors.mmNormalPerformance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PerformanceFactors1
	 * PerformanceFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrmlPrfrmnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalPerformance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Normal performance value of the NAV."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>> mmNormalPerformance = new MMMessageAttribute<PerformanceFactors1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> PerformanceFactors.mmNormalPerformance;
			componentContext_lazy = () -> com.tools20022.repository.msg.PerformanceFactors1.mmObject();
			isDerived = false;
			xmlTag = "NrmlPrfrmnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalPerformance";
			definition = "Normal performance value of the NAV.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(PerformanceFactors1 obj) {
			return obj.getNormalPerformance();
		}

		@Override
		public void setValue(PerformanceFactors1 obj, Optional<DecimalNumber> value) {
			obj.setNormalPerformance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PerformanceFactors1.mmCorporateActionFactor, com.tools20022.repository.msg.PerformanceFactors1.mmCumulativeCorporateActionFactor,
						com.tools20022.repository.msg.PerformanceFactors1.mmAccumulationPeriod, com.tools20022.repository.msg.PerformanceFactors1.mmNormalPerformance);
				trace_lazy = () -> PerformanceFactors.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccumulationPeriodRule.forPerformanceFactors1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PerformanceFactors1";
				definition = "Performance factors of the investment fund / fund class.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DecimalNumber> getCorporateActionFactor() {
		return corporateActionFactor == null ? Optional.empty() : Optional.of(corporateActionFactor);
	}

	public PerformanceFactors1 setCorporateActionFactor(DecimalNumber corporateActionFactor) {
		this.corporateActionFactor = corporateActionFactor;
		return this;
	}

	public Optional<DecimalNumber> getCumulativeCorporateActionFactor() {
		return cumulativeCorporateActionFactor == null ? Optional.empty() : Optional.of(cumulativeCorporateActionFactor);
	}

	public PerformanceFactors1 setCumulativeCorporateActionFactor(DecimalNumber cumulativeCorporateActionFactor) {
		this.cumulativeCorporateActionFactor = cumulativeCorporateActionFactor;
		return this;
	}

	public Optional<DatePeriodDetails> getAccumulationPeriod() {
		return accumulationPeriod == null ? Optional.empty() : Optional.of(accumulationPeriod);
	}

	public PerformanceFactors1 setAccumulationPeriod(DatePeriodDetails accumulationPeriod) {
		this.accumulationPeriod = accumulationPeriod;
		return this;
	}

	public Optional<DecimalNumber> getNormalPerformance() {
		return normalPerformance == null ? Optional.empty() : Optional.of(normalPerformance);
	}

	public PerformanceFactors1 setNormalPerformance(DecimalNumber normalPerformance) {
		this.normalPerformance = normalPerformance;
		return this;
	}
}