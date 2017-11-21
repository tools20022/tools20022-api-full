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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmIdentification
 * SecurityInstrumentDescription9.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmFullName
 * SecurityInstrumentDescription9.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmShortName
 * SecurityInstrumentDescription9.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmClassificationType
 * SecurityInstrumentDescription9.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmNotionalCurrency
 * SecurityInstrumentDescription9.mmNotionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmCommodityDerivativeIndicator
 * SecurityInstrumentDescription9.mmCommodityDerivativeIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityInstrumentDescription9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the security instrument by its name and typical characteristics."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
 * SecurityInstrumentDescription11}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityInstrumentDescription9", propOrder = {"identification", "fullName", "shortName", "classificationType", "notionalCurrency", "commodityDerivativeIndicator"})
public class SecurityInstrumentDescription9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier identification;
	/**
	 * Code used to identify the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code used to identify the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmIdentification
	 * SecurityInstrumentDescription11.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Code used to identify the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected Max350Text fullName;
	/**
	 * Full name of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full name of the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmFullName
	 * SecurityInstrumentDescription11.mmFullName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name of the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmFullName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text shortName;
	/**
	 * Short name of financial instrument in accordance with ISO 18774.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Short name of financial instrument in accordance with ISO 18774."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Short name of financial instrument in accordance with ISO 18774.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CFIOct2015Identifier classificationType;
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmClassificationType
	 * SecurityInstrumentDescription11.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassificationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification.";
			nextVersions_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmClassificationType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency;
	/**
	 * Currency in which the notional is denominated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the notional is denominated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmNotionalCurrency
	 * SecurityInstrumentDescription11.mmNotionalCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.";
			nextVersions_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmNotionalCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected TrueFalseIndicator commodityDerivativeIndicator;
	/**
	 * Indicates whether the financial instrument falls within the definition of
	 * commodities derivative under the local regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmmdtyDerivInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityDerivativeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument falls within the definition of commodities derivative under the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommodityDerivativeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityInstrumentDescription9.mmObject();
			isDerived = false;
			xmlTag = "CmmdtyDerivInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommodityDerivativeIndicator";
			definition = "Indicates whether the financial instrument falls within the definition of commodities derivative under the local regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityInstrumentDescription9.mmIdentification, SecurityInstrumentDescription9.mmFullName, SecurityInstrumentDescription9.mmShortName,
						SecurityInstrumentDescription9.mmClassificationType, SecurityInstrumentDescription9.mmNotionalCurrency, SecurityInstrumentDescription9.mmCommodityDerivativeIndicator);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityInstrumentDescription9";
				definition = "Identifies the security instrument by its name and typical characteristics.";
				nextVersions_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public void setIdentification(ISINOct2015Identifier identification) {
		this.identification = identification;
	}

	@XmlElement(name = "FullNm", required = true)
	public Max350Text getFullName() {
		return fullName;
	}

	public void setFullName(Max350Text fullName) {
		this.fullName = fullName;
	}

	@XmlElement(name = "ShrtNm")
	public Max35Text getShortName() {
		return shortName;
	}

	public void setShortName(Max35Text shortName) {
		this.shortName = shortName;
	}

	@XmlElement(name = "ClssfctnTp", required = true)
	public CFIOct2015Identifier getClassificationType() {
		return classificationType;
	}

	public void setClassificationType(CFIOct2015Identifier classificationType) {
		this.classificationType = classificationType;
	}

	@XmlElement(name = "NtnlCcy", required = true)
	public ActiveOrHistoricCurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(ActiveOrHistoricCurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}

	@XmlElement(name = "CmmdtyDerivInd", required = true)
	public TrueFalseIndicator getCommodityDerivativeIndicator() {
		return commodityDerivativeIndicator;
	}

	public void setCommodityDerivativeIndicator(TrueFalseIndicator commodityDerivativeIndicator) {
		this.commodityDerivativeIndicator = commodityDerivativeIndicator;
	}
}