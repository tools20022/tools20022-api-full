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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.AssetFXSubProductType1Code;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Attributes of non-financial instrument of type foreign exchange as
 * underlying.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmFXType
 * DerivativeForeignExchange3.mmFXType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmOtherNotionalCurrency
 * DerivativeForeignExchange3.mmOtherNotionalCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "DerivativeForeignExchange3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Attributes of non-financial instrument of type foreign exchange as underlying."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DerivativeForeignExchange3", propOrder = {"fXType", "otherNotionalCurrency"})
public class DerivativeForeignExchange3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FxTp")
	protected AssetFXSubProductType1Code fXType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code
	 * AssetFXSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialAssetCategory
	 * Asset.mmFinancialAssetCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
	 * DerivativeForeignExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the underlying currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeForeignExchange3, Optional<AssetFXSubProductType1Code>> mmFXType = new MMMessageAttribute<DerivativeForeignExchange3, Optional<AssetFXSubProductType1Code>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmFinancialAssetCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeForeignExchange3.mmObject();
			isDerived = false;
			xmlTag = "FxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXType";
			definition = "Type of the underlying currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetFXSubProductType1Code.mmObject();
		}

		@Override
		public Optional<AssetFXSubProductType1Code> getValue(DerivativeForeignExchange3 obj) {
			return obj.getFXType();
		}

		@Override
		public void setValue(DerivativeForeignExchange3 obj, Optional<AssetFXSubProductType1Code> value) {
			obj.setFXType(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrNtnlCcy")
	protected ActiveOrHistoricCurrencyCode otherNotionalCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
	 * Derivative.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
	 * DerivativeForeignExchange3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrNtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying currency 2 of the currency pair (the currency 1 will be populated in the notional currency).\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeForeignExchange3, Optional<ActiveOrHistoricCurrencyCode>> mmOtherNotionalCurrency = new MMMessageAttribute<DerivativeForeignExchange3, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeForeignExchange3.mmObject();
			isDerived = false;
			xmlTag = "OthrNtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNotionalCurrency";
			definition = "Underlying currency 2 of the currency pair (the currency 1 will be populated in the notional currency).\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(DerivativeForeignExchange3 obj) {
			return obj.getOtherNotionalCurrency();
		}

		@Override
		public void setValue(DerivativeForeignExchange3 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setOtherNotionalCurrency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeForeignExchange3.mmFXType, com.tools20022.repository.msg.DerivativeForeignExchange3.mmOtherNotionalCurrency);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeForeignExchange3";
				definition = "Attributes of non-financial instrument of type foreign exchange as underlying.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AssetFXSubProductType1Code> getFXType() {
		return fXType == null ? Optional.empty() : Optional.of(fXType);
	}

	public DerivativeForeignExchange3 setFXType(AssetFXSubProductType1Code fXType) {
		this.fXType = fXType;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getOtherNotionalCurrency() {
		return otherNotionalCurrency == null ? Optional.empty() : Optional.of(otherNotionalCurrency);
	}

	public DerivativeForeignExchange3 setOtherNotionalCurrency(ActiveOrHistoricCurrencyCode otherNotionalCurrency) {
		this.otherNotionalCurrency = otherNotionalCurrency;
		return this;
	}
}