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
import com.tools20022.repository.choice.RateAndAmountFormat16Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extension to specify rates of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DividendSD1#mmPlaceAndName
 * DividendSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmTotalAnnualDividendRate
 * DividendSD1.mmTotalAnnualDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmMaximumAnnualTotalDividendRate
 * DividendSD1.mmMaximumAnnualTotalDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmMinimumAnnualTotalDividendRate
 * DividendSD1.mmMinimumAnnualTotalDividendRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension to specify rates of a corporate action."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DividendSD1", propOrder = {"placeAndName", "totalAnnualDividendRate", "maximumAnnualTotalDividendRate", "minimumAnnualTotalDividendRate"})
public class DividendSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendSD1 DividendSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DividendSD1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<DividendSD1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(DividendSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(DividendSD1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAnlDvddRate")
	protected RateAndAmountFormat16Choice totalAnnualDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat16Choice
	 * RateAndAmountFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
	 * Dividend.mmAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendSD1 DividendSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAnlDvddRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAnnualDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the total annual dividend rate as announced by the Issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>> mmTotalAnnualDividendRate = new MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendSD1.mmObject();
			isDerived = false;
			xmlTag = "TtlAnlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAnnualDividendRate";
			definition = "Provides the total annual dividend rate as announced by the Issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat16Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat16Choice> getValue(DividendSD1 obj) {
			return obj.getTotalAnnualDividendRate();
		}

		@Override
		public void setValue(DividendSD1 obj, Optional<RateAndAmountFormat16Choice> value) {
			obj.setTotalAnnualDividendRate(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxAnlTtlDvddRate")
	protected RateAndAmountFormat16Choice maximumAnnualTotalDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat16Choice
	 * RateAndAmountFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
	 * Dividend.mmAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendSD1 DividendSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAnlTtlDvddRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAnnualTotalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the maximum annual total dividend rate as announced by the Issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>> mmMaximumAnnualTotalDividendRate = new MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendSD1.mmObject();
			isDerived = false;
			xmlTag = "MaxAnlTtlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAnnualTotalDividendRate";
			definition = "Provides the maximum annual total dividend rate as announced by the Issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat16Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat16Choice> getValue(DividendSD1 obj) {
			return obj.getMaximumAnnualTotalDividendRate();
		}

		@Override
		public void setValue(DividendSD1 obj, Optional<RateAndAmountFormat16Choice> value) {
			obj.setMaximumAnnualTotalDividendRate(value.orElse(null));
		}
	};
	@XmlElement(name = "MinAnlTtlDvddRate")
	protected RateAndAmountFormat16Choice minimumAnnualTotalDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat16Choice
	 * RateAndAmountFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
	 * Dividend.mmAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendSD1 DividendSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAnlTtlDvddRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAnnualTotalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the minimum annual total dividend rate as announced by the Issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>> mmMinimumAnnualTotalDividendRate = new MMMessageAttribute<DividendSD1, Optional<RateAndAmountFormat16Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendSD1.mmObject();
			isDerived = false;
			xmlTag = "MinAnlTtlDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAnnualTotalDividendRate";
			definition = "Provides the minimum annual total dividend rate as announced by the Issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat16Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat16Choice> getValue(DividendSD1 obj) {
			return obj.getMinimumAnnualTotalDividendRate();
		}

		@Override
		public void setValue(DividendSD1 obj, Optional<RateAndAmountFormat16Choice> value) {
			obj.setMinimumAnnualTotalDividendRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DividendSD1.mmPlaceAndName, com.tools20022.repository.msg.DividendSD1.mmTotalAnnualDividendRate,
						com.tools20022.repository.msg.DividendSD1.mmMaximumAnnualTotalDividendRate, com.tools20022.repository.msg.DividendSD1.mmMinimumAnnualTotalDividendRate);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendSD1";
				definition = "Extension to specify rates of a corporate action.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public DividendSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<RateAndAmountFormat16Choice> getTotalAnnualDividendRate() {
		return totalAnnualDividendRate == null ? Optional.empty() : Optional.of(totalAnnualDividendRate);
	}

	public DividendSD1 setTotalAnnualDividendRate(RateAndAmountFormat16Choice totalAnnualDividendRate) {
		this.totalAnnualDividendRate = totalAnnualDividendRate;
		return this;
	}

	public Optional<RateAndAmountFormat16Choice> getMaximumAnnualTotalDividendRate() {
		return maximumAnnualTotalDividendRate == null ? Optional.empty() : Optional.of(maximumAnnualTotalDividendRate);
	}

	public DividendSD1 setMaximumAnnualTotalDividendRate(RateAndAmountFormat16Choice maximumAnnualTotalDividendRate) {
		this.maximumAnnualTotalDividendRate = maximumAnnualTotalDividendRate;
		return this;
	}

	public Optional<RateAndAmountFormat16Choice> getMinimumAnnualTotalDividendRate() {
		return minimumAnnualTotalDividendRate == null ? Optional.empty() : Optional.of(minimumAnnualTotalDividendRate);
	}

	public DividendSD1 setMinimumAnnualTotalDividendRate(RateAndAmountFormat16Choice minimumAnnualTotalDividendRate) {
		this.minimumAnnualTotalDividendRate = minimumAnnualTotalDividendRate;
		return this;
	}
}