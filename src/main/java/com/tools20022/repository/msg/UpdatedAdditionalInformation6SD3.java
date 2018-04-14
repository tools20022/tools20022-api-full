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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdatedAdditionalInformation6SD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension for additional information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfAdditionalInformationRule#forUpdatedAdditionalInformation6SD3
 * ConstraintUseOfAdditionalInformationRule.forUpdatedAdditionalInformation6SD3}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfOfferorShareLocalCodeRule#forUpdatedAdditionalInformation6SD3
 * ConstraintUseOfOfferorShareLocalCodeRule.forUpdatedAdditionalInformation6SD3}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfOfferorShareRule#forUpdatedAdditionalInformation6SD3
 * ConstraintUseOfOfferorShareRule.forUpdatedAdditionalInformation6SD3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdatedAdditionalInformation6SD3", propOrder = {"placeAndName", "securitiesCreditAccountIdentification", "offerorShare", "offerorShareLocalCode", "localLanguageName"})
public class UpdatedAdditionalInformation6SD3 {

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
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
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
	public static final MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmObject();
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
		public Optional<Max350Text> getValue(UpdatedAdditionalInformation6SD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation6SD3 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesCdtAcctId")
	protected Max50Text securitiesCreditAccountIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCreditAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities account to be credited.\r\n会社法制の見直し要綱の、22ページ第３－１－①をご参照ください。."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max50Text>> mmSecuritiesCreditAccountIdentification = new MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max50Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "SctiesCdtAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCreditAccountIdentification";
			definition = "Specifies the securities account to be credited.\r\n会社法制の見直し要綱の、22ページ第３－１－①をご参照ください。.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public Optional<Max50Text> getValue(UpdatedAdditionalInformation6SD3 obj) {
			return obj.getSecuritiesCreditAccountIdentification();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation6SD3 obj, Optional<Max50Text> value) {
			obj.setSecuritiesCreditAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferrShr")
	protected ISINIdentifier offerorShare;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferorShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN of Offeror's share when the corporate action event type code is TEND."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<ISINIdentifier>> mmOfferorShare = new MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<ISINIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "OfferrShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferorShare";
			definition = "ISIN of Offeror's share when the corporate action event type code is TEND.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINIdentifier.mmObject();
		}

		@Override
		public Optional<ISINIdentifier> getValue(UpdatedAdditionalInformation6SD3 obj) {
			return obj.getOfferorShare();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation6SD3 obj, Optional<ISINIdentifier> value) {
			obj.setOfferorShare(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferrShrLclCd")
	protected Max5AlphaNumericText offerorShareLocalCode;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferorShareLocalCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local code of Offeror's share when the corporate action event type code is TEND.\r\n買付者 銘柄コード."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max5AlphaNumericText>> mmOfferorShareLocalCode = new MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max5AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "OfferrShrLclCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferorShareLocalCode";
			definition = "Local code of Offeror's share when the corporate action event type code is TEND.\r\n買付者 銘柄コード.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max5AlphaNumericText> getValue(UpdatedAdditionalInformation6SD3 obj) {
			return obj.getOfferorShareLocalCode();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation6SD3 obj, Optional<Max5AlphaNumericText> value) {
			obj.setOfferorShareLocalCode(value.orElse(null));
		}
	};
	@XmlElement(name = "LclLangNm")
	protected Max240Text localLanguageName;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalLanguageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name in the local language by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max240Text>> mmLocalLanguageName = new MMMessageAttribute<UpdatedAdditionalInformation6SD3, Optional<Max240Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmObject();
			isDerived = false;
			xmlTag = "LclLangNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalLanguageName";
			definition = "Name in the local language by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max240Text.mmObject();
		}

		@Override
		public Optional<Max240Text> getValue(UpdatedAdditionalInformation6SD3 obj) {
			return obj.getLocalLanguageName();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation6SD3 obj, Optional<Max240Text> value) {
			obj.setLocalLanguageName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmPlaceAndName,
						com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmSecuritiesCreditAccountIdentification, com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmOfferorShare,
						com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmOfferorShareLocalCode, com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3.mmLocalLanguageName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUseOfAdditionalInformationRule.forUpdatedAdditionalInformation6SD3,
						com.tools20022.repository.constraints.ConstraintUseOfOfferorShareLocalCodeRule.forUpdatedAdditionalInformation6SD3,
						com.tools20022.repository.constraints.ConstraintUseOfOfferorShareRule.forUpdatedAdditionalInformation6SD3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdatedAdditionalInformation6SD3";
				definition = "Extension for additional information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public UpdatedAdditionalInformation6SD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<Max50Text> getSecuritiesCreditAccountIdentification() {
		return securitiesCreditAccountIdentification == null ? Optional.empty() : Optional.of(securitiesCreditAccountIdentification);
	}

	public UpdatedAdditionalInformation6SD3 setSecuritiesCreditAccountIdentification(Max50Text securitiesCreditAccountIdentification) {
		this.securitiesCreditAccountIdentification = securitiesCreditAccountIdentification;
		return this;
	}

	public Optional<ISINIdentifier> getOfferorShare() {
		return offerorShare == null ? Optional.empty() : Optional.of(offerorShare);
	}

	public UpdatedAdditionalInformation6SD3 setOfferorShare(ISINIdentifier offerorShare) {
		this.offerorShare = offerorShare;
		return this;
	}

	public Optional<Max5AlphaNumericText> getOfferorShareLocalCode() {
		return offerorShareLocalCode == null ? Optional.empty() : Optional.of(offerorShareLocalCode);
	}

	public UpdatedAdditionalInformation6SD3 setOfferorShareLocalCode(Max5AlphaNumericText offerorShareLocalCode) {
		this.offerorShareLocalCode = offerorShareLocalCode;
		return this;
	}

	public Optional<Max240Text> getLocalLanguageName() {
		return localLanguageName == null ? Optional.empty() : Optional.of(localLanguageName);
	}

	public UpdatedAdditionalInformation6SD3 setLocalLanguageName(Max240Text localLanguageName) {
		this.localLanguageName = localLanguageName;
		return this;
	}
}