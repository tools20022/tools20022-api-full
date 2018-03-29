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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EligibilityCode;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quote1;
import com.tools20022.repository.msg.Quote2;
import com.tools20022.repository.msg.Quote3;
import com.tools20022.repository.msg.Quote4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Requestor of the quote
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuoteRequestor" src="doc-files/QuoteRequestor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuoteRequestor#mmRequestorEligibility
 * QuoteRequestor.mmRequestorEligibility}</li>
 * </ul>
 * </li>
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
 * "QuoteRequestor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Requestor of the quote"</li>
 * </ul>
 */
public class QuoteRequestor extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EligibilityCode requestorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote3#mmRequestorEligibility
	 * Quote3.mmRequestorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote1#mmRequestorEligibility
	 * Quote1.mmRequestorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote2#mmRequestorEligibility
	 * Quote2.mmRequestorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote4#mmRequestorEligibility
	 * Quote4.mmRequestorEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteRequestor
	 * QuoteRequestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the requestor of the quote is an elligible counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<QuoteRequestor, EligibilityCode> mmRequestorEligibility = new MMBusinessAttribute<QuoteRequestor, EligibilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Quote3.mmRequestorEligibility, Quote1.mmRequestorEligibility, Quote2.mmRequestorEligibility, Quote4.mmRequestorEligibility);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuoteRequestor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestorEligibility";
			definition = "Identifies if the requestor of the quote is an elligible counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}

		@Override
		public EligibilityCode getValue(QuoteRequestor obj) {
			return obj.getRequestorEligibility();
		}

		@Override
		public void setValue(QuoteRequestor obj, EligibilityCode value) {
			obj.setRequestorEligibility(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteRequestor";
				definition = "Requestor of the quote";
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuoteRequestor.mmRequestorEligibility);
			}

			@Override
			public Class<?> getInstanceClass() {
				return QuoteRequestor.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EligibilityCode getRequestorEligibility() {
		return requestorEligibility;
	}

	public QuoteRequestor setRequestorEligibility(EligibilityCode requestorEligibility) {
		this.requestorEligibility = Objects.requireNonNull(requestorEligibility);
		return this;
	}
}