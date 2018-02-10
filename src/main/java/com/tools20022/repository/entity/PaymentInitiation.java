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
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorrectivePaymentInitiation1;
import com.tools20022.repository.msg.CorrectivePaymentInitiation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction is the first of the series of instructions
 * which may be used to execute a payment. It is normally sent by the initiating
 * party to the forwarding agent or to the debtor's agent.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInitiation" src="doc-files/PaymentInitiation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1
 * CorrectivePaymentInitiation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2
 * CorrectivePaymentInitiation2}</li>
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
 * "PaymentInitiation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction is the first of the series of instructions which may be used to execute a payment. It is normally sent by the initiating party to the forwarding agent or to the debtor's agent."
 * </li>
 * </ul>
 */
public class PaymentInitiation extends PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInitiation";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction is the first of the series of instructions which may be used to execute a payment. It is normally sent by the initiating party to the forwarding agent or to the debtor's agent.";
				superType_lazy = () -> PaymentExecution.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(CorrectivePaymentInitiation1.mmObject(), CorrectivePaymentInitiation2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInitiation.class;
			}
		});
		return mmObject_lazy.get();
	}
}