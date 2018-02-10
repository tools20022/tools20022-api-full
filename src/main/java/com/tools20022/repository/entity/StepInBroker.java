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
import com.tools20022.repository.entity.Broker;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConfirmationParties2;
import com.tools20022.repository.msg.ConfirmationParties4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Broker to which the investment manager directs the execution of a portion of
 * the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StepInBroker" src="doc-files/StepInBroker.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmStepInFirm
 * ConfirmationParties4.mmStepInFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmStepInFirm
 * ConfirmationParties2.mmStepInFirm}</li>
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
 * "StepInBroker"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Broker to which the investment manager directs the execution of a portion of the trade."
 * </li>
 * </ul>
 */
public class StepInBroker extends Broker {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StepInBroker";
				definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
				derivationElement_lazy = () -> Arrays.asList(ConfirmationParties4.mmStepInFirm, ConfirmationParties2.mmStepInFirm);
				superType_lazy = () -> Broker.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return StepInBroker.class;
			}
		});
		return mmObject_lazy.get();
	}
}