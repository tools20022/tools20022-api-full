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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardDirectDebit1;
import com.tools20022.repository.msg.Debtor2;
import com.tools20022.repository.msg.Debtor3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that owes an amount of money to the (ultimate) creditor. For example,
 * as a result of receipt of goods, assets, services, gifts, or charity
 * payments.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DebtorRole" src="doc-files/DebtorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardDirectDebit1#mmDebtorIdentification
 * CardDirectDebit1.mmDebtorIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Debtor2 Debtor2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debtor3 Debtor3}</li>
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
 * "DebtorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that owes an amount of money to the (ultimate) creditor. For example, as a result of receipt of goods, assets, services, gifts, or charity payments."
 * </li>
 * </ul>
 */
public class DebtorRole extends PaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebtorRole";
				definition = "Party that owes an amount of money to the (ultimate) creditor. For example, as a result of receipt of goods, assets, services, gifts, or charity payments.";
				derivationElement_lazy = () -> Arrays.asList(CardDirectDebit1.mmDebtorIdentification);
				superType_lazy = () -> PaymentPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Debtor2.mmObject(), Debtor3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebtorRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}