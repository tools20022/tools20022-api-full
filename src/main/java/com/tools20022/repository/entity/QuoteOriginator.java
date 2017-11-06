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
import com.tools20022.repository.codeset.OriginatorRoleCode;
import com.tools20022.repository.entity.InformationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Originator of the quote.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuoteOriginator" src="doc-files/QuoteOriginator.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
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
 * "QuoteOriginator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Originator of the quote."</li>
 * </ul>
 */
public class QuoteOriginator extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginatorRoleCode quoteOriginatorType;
	/**
	 * Identifies in what capacity(role) the originator of the quote is acting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuoteOriginator
	 * QuoteOriginator}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginatorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuoteOriginatorType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote3.mmQuoteOriginatorRole, com.tools20022.repository.msg.Quote1.mmQuoteOriginatorRole, com.tools20022.repository.msg.Quote4.mmQuoteOriginatorRole);
			elementContext_lazy = () -> QuoteOriginator.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteOriginatorType";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OriginatorRoleCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuoteOriginator";
				definition = "Originator of the quote.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote1.mmQuoteOriginator);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuoteOriginator.mmQuoteOriginatorType);
			}
		});
		return mmObject_lazy.get();
	}

	public OriginatorRoleCode getQuoteOriginatorType() {
		return quoteOriginatorType;
	}

	public void setQuoteOriginatorType(OriginatorRoleCode quoteOriginatorType) {
		this.quoteOriginatorType = quoteOriginatorType;
	}
}