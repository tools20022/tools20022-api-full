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
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Extension for additional information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3#mmPlaceAndName
 * UpdatedAdditionalInformation6SD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3#mmSecuritiesCreditAccountIdentification
 * UpdatedAdditionalInformation6SD3.mmSecuritiesCreditAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3#mmOfferorShare
 * UpdatedAdditionalInformation6SD3.mmOfferorShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3#mmOfferorShareLocalCode
 * UpdatedAdditionalInformation6SD3.mmOfferorShareLocalCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3#mmLocalLanguageName
 * UpdatedAdditionalInformation6SD3.mmLocalLanguageName}</li>
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
 * "UpdatedAdditionalInformation6SD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension for additional information."</li>
 * </ul>
 */
public class UpdatedAdditionalInformation6SD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance. <br>
	 * <br>
	 * In the case of XML, this is expressed by a valid XPath.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max50Text securitiesCreditAccountIdentification;
	/**
	 * Specifies the securities account to be credited.<br>
	 * 会社法制の見直し要綱の、22ページ第３－１－①をご参照ください。
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesCdtAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCreditAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities account to be credited.\r\n会社法制の見直し要綱の、22ページ第３－１－①をご参照ください。"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesCreditAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "SctiesCdtAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCreditAccountIdentification";
			definition = "Specifies the securities account to be credited.\r\n会社法制の見直し要綱の、22ページ第３－１－①をご参照ください。";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}
	};
	protected ISINIdentifier offerorShare;
	/**
	 * ISIN of Offeror's share when the corporate action event type code is
	 * TEND.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINIdentifier
	 * ISINIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferrShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferorShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN of Offeror's share when the corporate action event type code is TEND."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfferorShare = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "OfferrShr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferorShare";
			definition = "ISIN of Offeror's share when the corporate action event type code is TEND.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINIdentifier.mmObject();
		}
	};
	protected Max5AlphaNumericText offerorShareLocalCode;
	/**
	 * Local code of Offeror's share when the corporate action event type code
	 * is TEND.<br>
	 * 買付者 銘柄コード
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5AlphaNumericText
	 * Max5AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferrShrLclCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferorShareLocalCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local code of Offeror's share when the corporate action event type code is TEND.\r\n買付者 銘柄コード"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfferorShareLocalCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "OfferrShrLclCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferorShareLocalCode";
			definition = "Local code of Offeror's share when the corporate action event type code is TEND.\r\n買付者 銘柄コード";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5AlphaNumericText.mmObject();
		}
	};
	protected Max240Text localLanguageName;
	/**
	 * Name in the local language by which a party is known and which is usually
	 * used to identify that party.
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
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclLangNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalLanguageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name in the local language by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalLanguageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "LclLangNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalLanguageName";
			definition = "Name in the local language by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max240Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmPlaceAndName,
						com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmSecuritiesCreditAccountIdentification, com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmOfferorShare,
						com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmOfferorShareLocalCode, com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmLocalLanguageName);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UpdatedAdditionalInformation6SD3";
				definition = "Extension for additional information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public Max50Text getSecuritiesCreditAccountIdentification() {
		return securitiesCreditAccountIdentification;
	}

	public void setSecuritiesCreditAccountIdentification(Max50Text securitiesCreditAccountIdentification) {
		this.securitiesCreditAccountIdentification = securitiesCreditAccountIdentification;
	}

	public ISINIdentifier getOfferorShare() {
		return offerorShare;
	}

	public void setOfferorShare(ISINIdentifier offerorShare) {
		this.offerorShare = offerorShare;
	}

	public Max5AlphaNumericText getOfferorShareLocalCode() {
		return offerorShareLocalCode;
	}

	public void setOfferorShareLocalCode(Max5AlphaNumericText offerorShareLocalCode) {
		this.offerorShareLocalCode = offerorShareLocalCode;
	}

	public Max240Text getLocalLanguageName() {
		return localLanguageName;
	}

	public void setLocalLanguageName(Max240Text localLanguageName) {
		this.localLanguageName = localLanguageName;
	}
}