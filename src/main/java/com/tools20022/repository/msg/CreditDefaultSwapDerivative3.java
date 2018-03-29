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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max25Text;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditDefaultSwapIndex2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Credit default swap derivative specific for reporting derivatives on a credit
 * default swap index.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmUnderlyingIndexIdentification
 * CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmIndexName
 * CreditDefaultSwapDerivative3.mmIndexName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmIndex
 * CreditDefaultSwapDerivative3.mmIndex}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
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
 * "CreditDefaultSwapDerivative3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap derivative specific for reporting derivatives on a credit default swap index."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditDefaultSwapDerivative3", propOrder = {"underlyingIndexIdentification", "indexName", "index"})
public class CreditDefaultSwapDerivative3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UndrlygIndxId")
	protected ISINOct2015Identifier underlyingIndexIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3
	 * CreditDefaultSwapDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygIndxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingIndexIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Derivative on a credit default swap with the ISIN code of the underlying index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditDefaultSwapDerivative3, Optional<ISINOct2015Identifier>> mmUnderlyingIndexIdentification = new MMMessageAttribute<CreditDefaultSwapDerivative3, Optional<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "UndrlygIndxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingIndexIdentification";
			definition = "Derivative on a credit default swap with the ISIN code of the underlying index.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public Optional<ISINOct2015Identifier> getValue(CreditDefaultSwapDerivative3 obj) {
			return obj.getUnderlyingIndexIdentification();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative3 obj, Optional<ISINOct2015Identifier> value) {
			obj.setUnderlyingIndexIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IndxNm", required = true)
	protected Max25Text indexName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max25Text
	 * Max25Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmReferenceSource
	 * Index.mmReferenceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3
	 * CreditDefaultSwapDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To be populated for derivatives on a CDS index with the standardized name of the index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditDefaultSwapDerivative3, Max25Text> mmIndexName = new MMMessageAttribute<CreditDefaultSwapDerivative3, Max25Text>() {
		{
			businessElementTrace_lazy = () -> Index.mmReferenceSource;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "IndxNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexName";
			definition = "To be populated for derivatives on a CDS index with the standardized name of the index.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}

		@Override
		public Max25Text getValue(CreditDefaultSwapDerivative3 obj) {
			return obj.getIndexName();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative3 obj, Max25Text value) {
			obj.setIndexName(value);
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected CreditDefaultSwapIndex2 index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3
	 * CreditDefaultSwapDerivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the Index specific details the derivative is being made on."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditDefaultSwapDerivative3, CreditDefaultSwapIndex2> mmIndex = new MMMessageAssociationEnd<CreditDefaultSwapDerivative3, CreditDefaultSwapIndex2>() {
		{
			businessComponentTrace_lazy = () -> Index.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Describes the Index specific details the derivative is being made on.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapIndex2.mmObject();
		}

		@Override
		public CreditDefaultSwapIndex2 getValue(CreditDefaultSwapDerivative3 obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative3 obj, CreditDefaultSwapIndex2 value) {
			obj.setIndex(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification, com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmIndexName,
						com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmIndex);
				trace_lazy = () -> Index.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapDerivative3";
				definition = "Credit default swap derivative specific for reporting derivatives on a credit default swap index.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINOct2015Identifier> getUnderlyingIndexIdentification() {
		return underlyingIndexIdentification == null ? Optional.empty() : Optional.of(underlyingIndexIdentification);
	}

	public CreditDefaultSwapDerivative3 setUnderlyingIndexIdentification(ISINOct2015Identifier underlyingIndexIdentification) {
		this.underlyingIndexIdentification = underlyingIndexIdentification;
		return this;
	}

	public Max25Text getIndexName() {
		return indexName;
	}

	public CreditDefaultSwapDerivative3 setIndexName(Max25Text indexName) {
		this.indexName = Objects.requireNonNull(indexName);
		return this;
	}

	public CreditDefaultSwapIndex2 getIndex() {
		return index;
	}

	public CreditDefaultSwapDerivative3 setIndex(CreditDefaultSwapIndex2 index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}
}