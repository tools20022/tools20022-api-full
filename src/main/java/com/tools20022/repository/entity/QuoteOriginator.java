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
import com.tools20022.repository.codeset.OriginatorRoleCode;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quote1;
import com.tools20022.repository.msg.Quote3;
import com.tools20022.repository.msg.Quote4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Originator of the quote.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuoteOriginator" src="doc-files/QuoteOriginator.svg">
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
 * {@linkplain com.tools20022.repository.entity.QuoteOriginator#mmQuoteOriginatorType
 * QuoteOriginator.mmQuoteOriginatorType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmQuoteOriginator
 * Quote1.mmQuoteOriginator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteOriginator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Originator of the quote."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class QuoteOriginator extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginatorRoleCode quoteOriginatorType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote3#mmQuoteOriginatorRole
	 * Quote3.mmQuoteOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote1#mmQuoteOriginatorRole
	 * Quote1.mmQuoteOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote4#mmQuoteOriginatorRole
	 * Quote4.mmQuoteOriginatorRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteOriginator
	 * QuoteOriginator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginatorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<QuoteOriginator, OriginatorRoleCode> mmQuoteOriginatorType = new MMBusinessAttribute<QuoteOriginator, OriginatorRoleCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Quote3.mmQuoteOriginatorRole, Quote1.mmQuoteOriginatorRole, Quote4.mmQuoteOriginatorRole);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuoteOriginator.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteOriginatorType";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OriginatorRoleCode.mmObject();
		}

		@Override
		public OriginatorRoleCode getValue(QuoteOriginator obj) {
			return obj.getQuoteOriginatorType();
		}

		@Override
		public void setValue(QuoteOriginator obj, OriginatorRoleCode value) {
			obj.setQuoteOriginatorType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteOriginator";
				definition = "Originator of the quote.";
				derivationElement_lazy = () -> Arrays.asList(Quote1.mmQuoteOriginator);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuoteOriginator.mmQuoteOriginatorType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return QuoteOriginator.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OriginatorRoleCode getQuoteOriginatorType() {
		return quoteOriginatorType;
	}

	public QuoteOriginator setQuoteOriginatorType(OriginatorRoleCode quoteOriginatorType) {
		this.quoteOriginatorType = Objects.requireNonNull(quoteOriginatorType);
		return this;
	}
}