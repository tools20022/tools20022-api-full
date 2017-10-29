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
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity acquiring card payment transactions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AcquirerRole" src="doc-files/AcquirerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment5#Acquirer
 * CardPaymentEnvironment5.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#Acquirer
 * CardPaymentEnvironment6.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#Acquirer
 * CardPaymentEnvironment13.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#Acquirer
 * CardPaymentEnvironment14.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#Acquirer
 * CardPaymentEnvironment3.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#AcquirerIdentification
 * CardPaymentEnvironment11.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#AcquirerIdentification
 * CardPaymentEnvironment16.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#Acquirer
 * CardPaymentEnvironment1.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#Acquirer
 * CardPaymentEnvironment9.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#Acquirer
 * CardPaymentEnvironment7.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#Acquirer
 * CardPaymentEnvironment15.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#AcquirerIdentification
 * CardPaymentEnvironment19.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#Acquirer
 * CardPaymentEnvironment4.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#Acquirer
 * CardPaymentEnvironment12.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#Acquirer
 * CardPaymentEnvironment2.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#Acquirer
 * CardPaymentEnvironment10.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#Acquirer
 * CardPaymentEnvironment18.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#Acquirer
 * CardPaymentEnvironment31.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#Acquirer
 * CardPaymentEnvironment29.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#Acquirer
 * CardPaymentEnvironment24.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#Acquirer
 * CardPaymentEnvironment25.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Acquirer
 * CardPaymentEnvironment20.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#AcquirerIdentification
 * CardPaymentEnvironment30.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#Acquirer
 * CardPaymentEnvironment27.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#AcquirerIdentification
 * CardPaymentEnvironment28.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#AcquirerIdentification
 * CardPaymentEnvironment21.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#Acquirer
 * CardPaymentEnvironment26.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#Acquirer
 * CardPaymentEnvironment23.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#Acquirer
 * CardPaymentEnvironment22.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#Acquirer
 * CardPaymentEnvironment37.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#AcquirerIdentification
 * CardPaymentEnvironment33.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Acquirer
 * CardPaymentEnvironment32.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#Acquirer
 * CardPaymentEnvironment36.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#Acquirer
 * CardPaymentEnvironment43.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#AcquirerIdentification
 * CardPaymentEnvironment41.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#Acquirer
 * CardPaymentEnvironment42.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#Acquirer
 * CardPaymentEnvironment40.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#AcquirerIdentification
 * CardPaymentEnvironment44.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Acquirer
 * CardPaymentEnvironment34.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#Acquirer
 * CardPaymentEnvironment35.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#AcquirerIdentification
 * CardPaymentEnvironment38.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#Acquirer
 * CardPaymentEnvironment39.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#AcquirerIdentification
 * CardPaymentEnvironment46.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#Acquirer
 * CardPaymentEnvironment50.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#Acquirer
 * CardPaymentEnvironment52.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#Acquirer
 * CardPaymentEnvironment49.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#Acquirer
 * CardPaymentEnvironment51.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#Acquirer
 * CardPaymentEnvironment48.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#AcquirerIdentification
 * CardPaymentEnvironment56.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Acquirer
 * CardPaymentEnvironment45.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#Acquirer
 * CardPaymentEnvironment55.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#AcquirerIdentification
 * CardPaymentEnvironment54.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Acquirer
 * CardPaymentEnvironment53.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Acquirer
 * CardPaymentEnvironment47.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#Acquirer
 * CardPaymentEnvironment61.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#Acquirer
 * CardPaymentEnvironment64.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Acquirer
 * CardPaymentEnvironment60.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#AcquirerIdentification
 * CardPaymentEnvironment65.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#Acquirer
 * CardPaymentEnvironment67.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#AcquirerIdentification
 * CardPaymentEnvironment66.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#Acquirer
 * CardPaymentEnvironment62.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#AcquirerIdentification
 * CardPaymentEnvironment63.AcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#Acquirer
 * CardPaymentEnvironment58.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#Acquirer
 * CardPaymentEnvironment59.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#Acquirer
 * CardPaymentEnvironment57.Acquirer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer1 Acquirer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer2 Acquirer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer3 Acquirer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer6 Acquirer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer5 Acquirer5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer8 Acquirer8}</li>
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
 * "AcquirerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity acquiring card payment transactions."</li>
 * </ul>
 */
public class AcquirerRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcquirerRole";
				definition = "Entity acquiring card payment transactions.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment5.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment6.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment13.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment14.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment3.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment11.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment16.AcquirerIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment1.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment9.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment7.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment15.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment19.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment4.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment12.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment2.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment10.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment18.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment31.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment29.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment24.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment25.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment20.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment30.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment27.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment28.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment21.AcquirerIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment26.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment23.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment22.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment37.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment33.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment32.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment36.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment43.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment41.AcquirerIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment42.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment40.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment44.AcquirerIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment34.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment35.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment38.AcquirerIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment39.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment46.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment50.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment52.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment49.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment51.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment48.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment56.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment45.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment55.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment54.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment53.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment47.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment61.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment64.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment60.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment65.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment67.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment66.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment62.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment63.AcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment58.Acquirer, com.tools20022.repository.msg.CardPaymentEnvironment59.Acquirer,
						com.tools20022.repository.msg.CardPaymentEnvironment57.Acquirer);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Acquirer1.mmObject(), Acquirer2.mmObject(), Acquirer3.mmObject(), Acquirer4.mmObject(), Acquirer6.mmObject(), Acquirer5.mmObject(), Acquirer7.mmObject(), Acquirer8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}