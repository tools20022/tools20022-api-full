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
import com.tools20022.repository.codeset.InstitutionalClassificationCode;
import com.tools20022.repository.datatype.Max240Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information of the counterparty in case of [sankaku] gappei (a third party is
 * involved as one of the counterparties in the merger but there is no security
 * movement from the third party).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1#mmFinancialInstrumentIdentification
 * CounterpartyDetailsType1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1#mmPostEffectiveDateClassification
 * CounterpartyDetailsType1.mmPostEffectiveDateClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1#mmAbbreviatedLocalLanguageSecurityName
 * CounterpartyDetailsType1.mmAbbreviatedLocalLanguageSecurityName}</li>
 * </ul>
 * </li>
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
 * "CounterpartyDetailsType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information of the counterparty in case of [sankaku] gappei (a third party is involved as one of the counterparties in the merger but there is no security movement from the third party)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CounterpartyDetailsType1", propOrder = {"financialInstrumentIdentification", "postEffectiveDateClassification", "abbreviatedLocalLanguageSecurityName"})
public class CounterpartyDetailsType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification15 financialInstrumentIdentification;
	/**
	 * Identifies the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1
	 * CounterpartyDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CounterpartyDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identifies the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};
	protected InstitutionalClassificationCode postEffectiveDateClassification;
	/**
	 * Classification of the Issuer or the Counterparty institution in case of a
	 * merger.<br>
	 * 存続/消滅/親会社/子会社/未定の区分<br>
	 * ※イベントタイプがMRGRの場合に、存続会社or消滅会社、親会社or子会社の通知を見分けるために必要。
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1
	 * CounterpartyDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstFctvDtClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostEffectiveDateClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of the Issuer or the Counterparty institution in case of a merger.\r\n存続/消滅/親会社/子会社/未定の区分\r\n※イベントタイプがMRGRの場合に、存続会社or消滅会社、親会社or子会社の通知を見分けるために必要。"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostEffectiveDateClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CounterpartyDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "PstFctvDtClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostEffectiveDateClassification";
			definition = "Classification of the Issuer or the Counterparty institution in case of a merger.\r\n存続/消滅/親会社/子会社/未定の区分\r\n※イベントタイプがMRGRの場合に、存続会社or消滅会社、親会社or子会社の通知を見分けるために必要。";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InstitutionalClassificationCode.mmObject();
		}
	};
	protected Max240Text abbreviatedLocalLanguageSecurityName;
	/**
	 * Abbreviated name of underlying securities in the local language.<br>
	 * Note that in case of non-listed securities, it will be a full local
	 * language security name.<br>
	 * 銘柄名（銘柄略称）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max240Text
	 * Max240Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1
	 * CounterpartyDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AbbrvtdLclLangSctyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbbreviatedLocalLanguageSecurityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Abbreviated name of underlying securities in the local language.\r\nNote that in case of non-listed securities, it will be a full local language security name.\r\n銘柄名（銘柄略称）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAbbreviatedLocalLanguageSecurityName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CounterpartyDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "AbbrvtdLclLangSctyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AbbreviatedLocalLanguageSecurityName";
			definition = "Abbreviated name of underlying securities in the local language.\r\nNote that in case of non-listed securities, it will be a full local language security name.\r\n銘柄名（銘柄略称）";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max240Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CounterpartyDetailsType1.mmFinancialInstrumentIdentification, CounterpartyDetailsType1.mmPostEffectiveDateClassification,
						CounterpartyDetailsType1.mmAbbreviatedLocalLanguageSecurityName);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartyDetailsType1";
				definition = "Information of the counterparty in case of [sankaku] gappei (a third party is involved as one of the counterparties in the merger but there is no security movement from the third party).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification15 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification15 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "PstFctvDtClssfctn")
	public InstitutionalClassificationCode getPostEffectiveDateClassification() {
		return postEffectiveDateClassification;
	}

	public void setPostEffectiveDateClassification(InstitutionalClassificationCode postEffectiveDateClassification) {
		this.postEffectiveDateClassification = postEffectiveDateClassification;
	}

	@XmlElement(name = "AbbrvtdLclLangSctyNm", required = true)
	public Max240Text getAbbreviatedLocalLanguageSecurityName() {
		return abbreviatedLocalLanguageSecurityName;
	}

	public void setAbbreviatedLocalLanguageSecurityName(Max240Text abbreviatedLocalLanguageSecurityName) {
		this.abbreviatedLocalLanguageSecurityName = abbreviatedLocalLanguageSecurityName;
	}
}