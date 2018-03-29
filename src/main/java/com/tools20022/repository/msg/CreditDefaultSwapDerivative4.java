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
import com.tools20022.repository.msg.CreditDefaultSwapSingleName2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forCreditDefaultSwapDerivative4
 * ConstraintValidISINRule.forCreditDefaultSwapDerivative4}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditDefaultSwapDerivative4", propOrder = {"underlyingNameIdentification", "obligationIdentification", "singleName"})
public class CreditDefaultSwapDerivative4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UndrlygNmId")
	protected ISINOct2015Identifier underlyingNameIdentification;
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
	public static final MMMessageAttribute<CreditDefaultSwapDerivative4, Optional<ISINOct2015Identifier>> mmUnderlyingNameIdentification = new MMMessageAttribute<CreditDefaultSwapDerivative4, Optional<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingNameIdentification";
			definition = "Derivative on a credit default swap with the ISIN code of the underlying swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public Optional<ISINOct2015Identifier> getValue(CreditDefaultSwapDerivative4 obj) {
			return obj.getUnderlyingNameIdentification();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative4 obj, Optional<ISINOct2015Identifier> value) {
			obj.setUnderlyingNameIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgtnId", required = true)
	protected ISINOct2015Identifier obligationIdentification;
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
	public static final MMMessageAttribute<CreditDefaultSwapDerivative4, ISINOct2015Identifier> mmObligationIdentification = new MMMessageAttribute<CreditDefaultSwapDerivative4, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "OblgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationIdentification";
			definition = "Identification of the reference obligation for a derivative on a credit default swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(CreditDefaultSwapDerivative4 obj) {
			return obj.getObligationIdentification();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative4 obj, ISINOct2015Identifier value) {
			obj.setObligationIdentification(value);
		}
	};
	@XmlElement(name = "SnglNm", required = true)
	protected CreditDefaultSwapSingleName2 singleName;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CreditDefaultSwapDerivative4, CreditDefaultSwapSingleName2> mmSingleName = new MMMessageAssociationEnd<CreditDefaultSwapDerivative4, CreditDefaultSwapSingleName2>() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmObject();
			isDerived = false;
			xmlTag = "SnglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleName";
			definition = "Describes the single name specific details the derivative is being made on.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
		}

		@Override
		public CreditDefaultSwapSingleName2 getValue(CreditDefaultSwapDerivative4 obj) {
			return obj.getSingleName();
		}

		@Override
		public void setValue(CreditDefaultSwapDerivative4 obj, CreditDefaultSwapSingleName2 value) {
			obj.setSingleName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification, com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmObligationIdentification,
						com.tools20022.repository.msg.CreditDefaultSwapDerivative4.mmSingleName);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forCreditDefaultSwapDerivative4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapDerivative4";
				definition = "Credit default swap derivative specific for reporting derivatives on a single name.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINOct2015Identifier> getUnderlyingNameIdentification() {
		return underlyingNameIdentification == null ? Optional.empty() : Optional.of(underlyingNameIdentification);
	}

	public CreditDefaultSwapDerivative4 setUnderlyingNameIdentification(ISINOct2015Identifier underlyingNameIdentification) {
		this.underlyingNameIdentification = underlyingNameIdentification;
		return this;
	}

	public ISINOct2015Identifier getObligationIdentification() {
		return obligationIdentification;
	}

	public CreditDefaultSwapDerivative4 setObligationIdentification(ISINOct2015Identifier obligationIdentification) {
		this.obligationIdentification = Objects.requireNonNull(obligationIdentification);
		return this;
	}

	public CreditDefaultSwapSingleName2 getSingleName() {
		return singleName;
	}

	public CreditDefaultSwapDerivative4 setSingleName(CreditDefaultSwapSingleName2 singleName) {
		this.singleName = Objects.requireNonNull(singleName);
		return this;
	}
}