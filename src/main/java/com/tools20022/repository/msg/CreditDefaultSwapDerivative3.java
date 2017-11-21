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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditDefaultSwapDerivative3", propOrder = {"underlyingIndexIdentification", "indexName", "index"})
public class CreditDefaultSwapDerivative3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier underlyingIndexIdentification;
	/**
	 * Derivative on a credit default swap with the ISIN code of the underlying
	 * index.
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
	public static final MMMessageAttribute mmUnderlyingIndexIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "UndrlygIndxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingIndexIdentification";
			definition = "Derivative on a credit default swap with the ISIN code of the underlying index.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected Max25Text indexName;
	/**
	 * To be populated for derivatives on a CDS index with the standardized name
	 * of the index.
	 * <p>
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
	public static final MMMessageAttribute mmIndexName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmReferenceSource;
			componentContext_lazy = () -> CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "IndxNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexName";
			definition = "To be populated for derivatives on a CDS index with the standardized name of the index.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}
	};
	protected CreditDefaultSwapIndex2 index;
	/**
	 * Describes the Index specific details the derivative is being made on.
	 * <p>
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
	public static final MMMessageAssociationEnd mmIndex = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Index.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapDerivative3.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Describes the Index specific details the derivative is being made on.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapIndex2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification, CreditDefaultSwapDerivative3.mmIndexName, CreditDefaultSwapDerivative3.mmIndex);
				trace_lazy = () -> Index.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapDerivative3";
				definition = "Credit default swap derivative specific for reporting derivatives on a credit default swap index.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UndrlygIndxId")
	public ISINOct2015Identifier getUnderlyingIndexIdentification() {
		return underlyingIndexIdentification;
	}

	public void setUnderlyingIndexIdentification(ISINOct2015Identifier underlyingIndexIdentification) {
		this.underlyingIndexIdentification = underlyingIndexIdentification;
	}

	@XmlElement(name = "IndxNm", required = true)
	public Max25Text getIndexName() {
		return indexName;
	}

	public void setIndexName(Max25Text indexName) {
		this.indexName = indexName;
	}

	@XmlElement(name = "Indx", required = true)
	public CreditDefaultSwapIndex2 getIndex() {
		return index;
	}

	public void setIndex(com.tools20022.repository.msg.CreditDefaultSwapIndex2 index) {
		this.index = index;
	}
}