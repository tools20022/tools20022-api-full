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
import com.tools20022.repository.msg.CounterpartyDetailsType1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MergerDetailsType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides additional information about mergers."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MergerDetailsType1", propOrder = {"mergerType", "counterpartyDetails", "simplifiedMergerClassification", "shortFormMergerClassification", "shareUnitQuantityOfNewCompany"})
public class MergerDetailsType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgrTp")
	protected MergerTypeCode mergerType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MergerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Differentiation of different types of merger.\r\n合併/株式交換/株式移転の区分."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MergerDetailsType1, Optional<MergerTypeCode>> mmMergerType = new MMMessageAttribute<MergerDetailsType1, Optional<MergerTypeCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "MrgrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MergerType";
			definition = "Differentiation of different types of merger.\r\n合併/株式交換/株式移転の区分.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerTypeCode.mmObject();
		}

		@Override
		public Optional<MergerTypeCode> getValue(MergerDetailsType1 obj) {
			return obj.getMergerType();
		}

		@Override
		public void setValue(MergerDetailsType1 obj, Optional<MergerTypeCode> value) {
			obj.setMergerType(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtyDtls")
	protected List<CounterpartyDetailsType1> counterpartyDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the counterparty in case of [sankaku] gappei: the scenario where a third party is involved as one of the counterparties in the merger but there is no security movement from the third party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MergerDetailsType1, List<CounterpartyDetailsType1>> mmCounterpartyDetails = new MMMessageAttribute<MergerDetailsType1, List<CounterpartyDetailsType1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyDetails";
			definition = "Information about the counterparty in case of [sankaku] gappei: the scenario where a third party is involved as one of the counterparties in the merger but there is no security movement from the third party.";
			minOccurs = 0;
			complexType_lazy = () -> CounterpartyDetailsType1.mmObject();
		}

		@Override
		public List<CounterpartyDetailsType1> getValue(MergerDetailsType1 obj) {
			return obj.getCounterpartyDetails();
		}

		@Override
		public void setValue(MergerDetailsType1 obj, List<CounterpartyDetailsType1> value) {
			obj.setCounterpartyDetails(value);
		}
	};
	@XmlElement(name = "SmplfdMrgrClssfctn")
	protected MergerCode simplifiedMergerClassification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SimplifiedMergerClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of the simplified merger regulatory condition of the parent company.\r\n簡易区分."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MergerDetailsType1, Optional<MergerCode>> mmSimplifiedMergerClassification = new MMMessageAttribute<MergerDetailsType1, Optional<MergerCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "SmplfdMrgrClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SimplifiedMergerClassification";
			definition = "Classification of the simplified merger regulatory condition of the parent company.\r\n簡易区分.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerCode.mmObject();
		}

		@Override
		public Optional<MergerCode> getValue(MergerDetailsType1 obj) {
			return obj.getSimplifiedMergerClassification();
		}

		@Override
		public void setValue(MergerDetailsType1 obj, Optional<MergerCode> value) {
			obj.setSimplifiedMergerClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrtFormMrgrClssfctn")
	protected MergerCode shortFormMergerClassification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortFormMergerClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of the short form merger regulatory condition of the subsidiary company.\r\n略式区分."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MergerDetailsType1, Optional<MergerCode>> mmShortFormMergerClassification = new MMMessageAttribute<MergerDetailsType1, Optional<MergerCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "ShrtFormMrgrClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortFormMergerClassification";
			definition = "Classification of the short form merger regulatory condition of the subsidiary company.\r\n略式区分.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MergerCode.mmObject();
		}

		@Override
		public Optional<MergerCode> getValue(MergerDetailsType1 obj) {
			return obj.getShortFormMergerClassification();
		}

		@Override
		public void setValue(MergerDetailsType1 obj, Optional<MergerCode> value) {
			obj.setShortFormMergerClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrUnitQtyOfNewCpny")
	protected Number shareUnitQuantityOfNewCompany;
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
	 * {@linkplain com.tools20022.repository.msg.MergerDetailsType1
	 * MergerDetailsType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrUnitQtyOfNewCpny"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareUnitQuantityOfNewCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share unit quantity of the shares of the new company.\r\n新設会社の単元株数."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MergerDetailsType1, Optional<Number>> mmShareUnitQuantityOfNewCompany = new MMMessageAttribute<MergerDetailsType1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MergerDetailsType1.mmObject();
			isDerived = false;
			xmlTag = "ShrUnitQtyOfNewCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareUnitQuantityOfNewCompany";
			definition = "Share unit quantity of the shares of the new company.\r\n新設会社の単元株数.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(MergerDetailsType1 obj) {
			return obj.getShareUnitQuantityOfNewCompany();
		}

		@Override
		public void setValue(MergerDetailsType1 obj, Optional<Number> value) {
			obj.setShareUnitQuantityOfNewCompany(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MergerDetailsType1.mmMergerType, com.tools20022.repository.msg.MergerDetailsType1.mmCounterpartyDetails,
						com.tools20022.repository.msg.MergerDetailsType1.mmSimplifiedMergerClassification, com.tools20022.repository.msg.MergerDetailsType1.mmShortFormMergerClassification,
						com.tools20022.repository.msg.MergerDetailsType1.mmShareUnitQuantityOfNewCompany);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MergerDetailsType1";
				definition = "Provides additional information about mergers.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MergerTypeCode> getMergerType() {
		return mergerType == null ? Optional.empty() : Optional.of(mergerType);
	}

	public MergerDetailsType1 setMergerType(MergerTypeCode mergerType) {
		this.mergerType = mergerType;
		return this;
	}

	public List<CounterpartyDetailsType1> getCounterpartyDetails() {
		return counterpartyDetails == null ? counterpartyDetails = new ArrayList<>() : counterpartyDetails;
	}

	public MergerDetailsType1 setCounterpartyDetails(List<CounterpartyDetailsType1> counterpartyDetails) {
		this.counterpartyDetails = Objects.requireNonNull(counterpartyDetails);
		return this;
	}

	public Optional<MergerCode> getSimplifiedMergerClassification() {
		return simplifiedMergerClassification == null ? Optional.empty() : Optional.of(simplifiedMergerClassification);
	}

	public MergerDetailsType1 setSimplifiedMergerClassification(MergerCode simplifiedMergerClassification) {
		this.simplifiedMergerClassification = simplifiedMergerClassification;
		return this;
	}

	public Optional<MergerCode> getShortFormMergerClassification() {
		return shortFormMergerClassification == null ? Optional.empty() : Optional.of(shortFormMergerClassification);
	}

	public MergerDetailsType1 setShortFormMergerClassification(MergerCode shortFormMergerClassification) {
		this.shortFormMergerClassification = shortFormMergerClassification;
		return this;
	}

	public Optional<Number> getShareUnitQuantityOfNewCompany() {
		return shareUnitQuantityOfNewCompany == null ? Optional.empty() : Optional.of(shareUnitQuantityOfNewCompany);
	}

	public MergerDetailsType1 setShareUnitQuantityOfNewCompany(Number shareUnitQuantityOfNewCompany) {
		this.shareUnitQuantityOfNewCompany = shareUnitQuantityOfNewCompany;
		return this;
	}
}