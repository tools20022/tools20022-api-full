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
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Credit default swap derivative specific for reporting derivatives on a single
 * name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmUnderlyingNameIdentification
 * CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmObligationIdentification
 * CreditDefaultSwapDerivative4.mmObligationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmSingleName
 * CreditDefaultSwapDerivative4.mmSingleName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
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
 * "CreditDefaultSwapDerivative4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap derivative specific for reporting derivatives on a single name."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditDefaultSwapDerivative4", propOrder = {"underlyingNameIdentification", "obligationIdentification", "singleName"})
public class CreditDefaultSwapDerivative4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier underlyingNameIdentification;
	/**
	 * Derivative on a credit default swap with the ISIN code of the underlying
	 * swap.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
	 * CreditDefaultSwapDerivative4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Derivative on a credit default swap with the ISIN code of the underlying swap."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnderlyingNameIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingNameIdentification";
			definition = "Derivative on a credit default swap with the ISIN code of the underlying swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected ISINOct2015Identifier obligationIdentification;
	/**
	 * Identification of the reference obligation for a derivative on a credit
	 * default swap.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
	 * CreditDefaultSwapDerivative4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reference obligation for a derivative on a credit default swap."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmObligationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "OblgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationIdentification";
			definition = "Identification of the reference obligation for a derivative on a credit default swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected CreditDefaultSwapSingleName2 singleName;
	/**
	 * Describes the single name specific details the derivative is being made
	 * on.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
	 * CreditDefaultSwapSingleName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
	 * CreditDefaultSwapDerivative4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the single name specific details the derivative is being made on."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleName = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "SnglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleName";
			definition = "Describes the single name specific details the derivative is being made on.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapSingleName2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification, CreditDefaultSwapDerivative4.mmObligationIdentification, CreditDefaultSwapDerivative4.mmSingleName);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapDerivative4";
				definition = "Credit default swap derivative specific for reporting derivatives on a single name.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UndrlygNmId")
	public ISINOct2015Identifier getUnderlyingNameIdentification() {
		return underlyingNameIdentification;
	}

	public void setUnderlyingNameIdentification(ISINOct2015Identifier underlyingNameIdentification) {
		this.underlyingNameIdentification = underlyingNameIdentification;
	}

	@XmlElement(name = "OblgtnId", required = true)
	public ISINOct2015Identifier getObligationIdentification() {
		return obligationIdentification;
	}

	public void setObligationIdentification(ISINOct2015Identifier obligationIdentification) {
		this.obligationIdentification = obligationIdentification;
	}

	@XmlElement(name = "SnglNm", required = true)
	public CreditDefaultSwapSingleName2 getSingleName() {
		return singleName;
	}

	public void setSingleName(com.tools20022.repository.msg.CreditDefaultSwapSingleName2 singleName) {
		this.singleName = singleName;
	}
}