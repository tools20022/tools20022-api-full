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
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max350Text;
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
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmIdentification
 * SecurityInstrumentDescription11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmFullName
 * SecurityInstrumentDescription11.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmClassificationType
 * SecurityInstrumentDescription11.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmNotionalCurrency
 * SecurityInstrumentDescription11.mmNotionalCurrency}</li>
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
 * "SecurityInstrumentDescription11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the security instrument by its name and typical characteristics."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
 * SecurityInstrumentDescription9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityInstrumentDescription11", propOrder = {"identification", "fullName", "classificationType", "notionalCurrency"})
public class SecurityInstrumentDescription11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier identification;
	/**
	 * Identifies the financial instrument using an ISIN.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
	 * SecurityInstrumentDescription11}</li>
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
	 * definition} = "Identifies the financial instrument using an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmIdentification
	 * SecurityInstrumentDescription9.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecurityInstrumentDescription11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the financial instrument using an ISIN.";
			previousVersion_lazy = () -> SecurityInstrumentDescription9.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected Max350Text fullName;
	/**
	 * Full name or description of the financial instrument.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
	 * SecurityInstrumentDescription11}</li>
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
	 * definition} = "Full name or description of the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmFullName
	 * SecurityInstrumentDescription9.mmFullName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> SecurityInstrumentDescription11.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name or description of the financial instrument.";
			previousVersion_lazy = () -> SecurityInstrumentDescription9.mmFullName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CFIOct2015Identifier classificationType;
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * classification of financial instrument (CFI) codification, that is common
	 * share with voting rights, fully paid, or registered.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
	 * SecurityInstrumentDescription11}</li>
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
	 * "Classification type of the financial instrument, as per the ISO classification of financial instrument (CFI) codification, that is common share with voting rights, fully paid, or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmClassificationType
	 * SecurityInstrumentDescription9.mmClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassificationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> SecurityInstrumentDescription11.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO classification of financial instrument (CFI) codification, that is common share with voting rights, fully paid, or registered.";
			previousVersion_lazy = () -> SecurityInstrumentDescription9.mmClassificationType;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11
	 * SecurityInstrumentDescription11}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmNotionalCurrency
	 * SecurityInstrumentDescription9.mmNotionalCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> SecurityInstrumentDescription11.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.";
			previousVersion_lazy = () -> SecurityInstrumentDescription9.mmNotionalCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityInstrumentDescription11.mmIdentification, SecurityInstrumentDescription11.mmFullName, SecurityInstrumentDescription11.mmClassificationType,
						SecurityInstrumentDescription11.mmNotionalCurrency);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityInstrumentDescription11";
				definition = "Identifies the security instrument by its name and typical characteristics.";
				previousVersion_lazy = () -> SecurityInstrumentDescription9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id")
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

	@XmlElement(name = "ClssfctnTp", required = true)
	public CFIOct2015Identifier getClassificationType() {
		return classificationType;
	}

	public void setClassificationType(CFIOct2015Identifier classificationType) {
		this.classificationType = classificationType;
	}

	@XmlElement(name = "NtnlCcy")
	public ActiveOrHistoricCurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(ActiveOrHistoricCurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}
}