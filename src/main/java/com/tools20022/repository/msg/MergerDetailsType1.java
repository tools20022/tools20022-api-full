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
import com.tools20022.repository.codeset.MergerCode;
import com.tools20022.repository.codeset.MergerTypeCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides additional information about mergers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1#mmMergerType
 * MergerDetailsType1.mmMergerType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1#mmCounterpartyDetails
 * MergerDetailsType1.mmCounterpartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1#mmSimplifiedMergerClassification
 * MergerDetailsType1.mmSimplifiedMergerClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1#mmShortFormMergerClassification
 * MergerDetailsType1.mmShortFormMergerClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1#mmShareUnitQuantityOfNewCompany
 * MergerDetailsType1.mmShareUnitQuantityOfNewCompany}</li>
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
 * "MergerDetailsType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides additional information about mergers."</li>
 * </ul>
 */
public class MergerDetailsType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MergerTypeCode mergerType;
	/**
	 * Differentiation of different types of merger.<br>
	 * 合併/株式交換/株式移転の区分
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MergerTypeCode
	 * MergerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MergerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Differentiation of different types of merger.\r\n合併/株式交換/株式移転の区分"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMergerType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "MrgrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MergerType";
			definition = "Differentiation of different types of merger.\r\n合併/株式交換/株式移転の区分";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CounterpartyDetailsType1> counterpartyDetails;
	/**
	 * Information about the counterparty in case of [sankaku] gappei: the
	 * scenario where a third party is involved as one of the counterparties in
	 * the merger but there is no security movement from the third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartyDetailsType1
	 * CounterpartyDetailsType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the counterparty in case of [sankaku] gappei: the scenario where a third party is involved as one of the counterparties in the merger but there is no security movement from the third party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyDetails";
			definition = "Information about the counterparty in case of [sankaku] gappei: the scenario where a third party is involved as one of the counterparties in the merger but there is no security movement from the third party.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CounterpartyDetailsType1.mmObject();
		}
	};
	protected MergerCode simplifiedMergerClassification;
	/**
	 * Classification of the simplified merger regulatory condition of the
	 * parent company.<br>
	 * 簡易区分
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.MergerCode
	 * MergerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmplfdMrgrClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SimplifiedMergerClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of the simplified merger regulatory condition of the parent company.\r\n簡易区分"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSimplifiedMergerClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "SmplfdMrgrClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SimplifiedMergerClassification";
			definition = "Classification of the simplified merger regulatory condition of the parent company.\r\n簡易区分";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerCode.mmObject();
		}
	};
	protected MergerCode shortFormMergerClassification;
	/**
	 * Classification of the short form merger regulatory condition of the
	 * subsidiary company.<br>
	 * 略式区分
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.MergerCode
	 * MergerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtFormMrgrClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortFormMergerClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of the short form merger regulatory condition of the subsidiary company.\r\n略式区分"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortFormMergerClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "ShrtFormMrgrClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortFormMergerClassification";
			definition = "Classification of the short form merger regulatory condition of the subsidiary company.\r\n略式区分";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerCode.mmObject();
		}
	};
	protected Number shareUnitQuantityOfNewCompany;
	/**
	 * Share unit quantity of the shares of the new company.<br>
	 * 新設会社の単元株数
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrUnitQtyOfNewCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareUnitQuantityOfNewCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share unit quantity of the shares of the new company.\r\n新設会社の単元株数"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShareUnitQuantityOfNewCompany = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "ShrUnitQtyOfNewCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareUnitQuantityOfNewCompany";
			definition = "Share unit quantity of the shares of the new company.\r\n新設会社の単元株数";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MergerDetailsType1.mmMergerType, MergerDetailsType1.mmCounterpartyDetails, MergerDetailsType1.mmSimplifiedMergerClassification, MergerDetailsType1.mmShortFormMergerClassification,
						MergerDetailsType1.mmShareUnitQuantityOfNewCompany);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MergerDetailsType1";
				definition = "Provides additional information about mergers.";
			}
		});
		return mmObject_lazy.get();
	}

	public MergerTypeCode getMergerType() {
		return mergerType;
	}

	public void setMergerType(MergerTypeCode mergerType) {
		this.mergerType = mergerType;
	}

	public List<CounterpartyDetailsType1> getCounterpartyDetails() {
		return counterpartyDetails;
	}

	public void setCounterpartyDetails(List<com.tools20022.repository.msg.CounterpartyDetailsType1> counterpartyDetails) {
		this.counterpartyDetails = counterpartyDetails;
	}

	public MergerCode getSimplifiedMergerClassification() {
		return simplifiedMergerClassification;
	}

	public void setSimplifiedMergerClassification(MergerCode simplifiedMergerClassification) {
		this.simplifiedMergerClassification = simplifiedMergerClassification;
	}

	public MergerCode getShortFormMergerClassification() {
		return shortFormMergerClassification;
	}

	public void setShortFormMergerClassification(MergerCode shortFormMergerClassification) {
		this.shortFormMergerClassification = shortFormMergerClassification;
	}

	public Number getShareUnitQuantityOfNewCompany() {
		return shareUnitQuantityOfNewCompany;
	}

	public void setShareUnitQuantityOfNewCompany(Number shareUnitQuantityOfNewCompany) {
		this.shareUnitQuantityOfNewCompany = shareUnitQuantityOfNewCompany;
	}
}