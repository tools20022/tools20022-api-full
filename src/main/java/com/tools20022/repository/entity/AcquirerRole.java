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
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment5#mmAcquirer
 * CardPaymentEnvironment5.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#mmAcquirer
 * CardPaymentEnvironment6.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#mmAcquirer
 * CardPaymentEnvironment13.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmAcquirer
 * CardPaymentEnvironment14.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#mmAcquirer
 * CardPaymentEnvironment3.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#mmAcquirerIdentification
 * CardPaymentEnvironment11.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmAcquirerIdentification
 * CardPaymentEnvironment16.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#mmAcquirer
 * CardPaymentEnvironment1.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#mmAcquirer
 * CardPaymentEnvironment9.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#mmAcquirer
 * CardPaymentEnvironment7.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#mmAcquirer
 * CardPaymentEnvironment15.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmAcquirerIdentification
 * CardPaymentEnvironment19.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#mmAcquirer
 * CardPaymentEnvironment4.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#mmAcquirer
 * CardPaymentEnvironment12.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#mmAcquirer
 * CardPaymentEnvironment2.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmAcquirer
 * CardPaymentEnvironment10.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#mmAcquirer
 * CardPaymentEnvironment18.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmAcquirer
 * CardPaymentEnvironment31.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#mmAcquirer
 * CardPaymentEnvironment29.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#mmAcquirer
 * CardPaymentEnvironment24.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#mmAcquirer
 * CardPaymentEnvironment25.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#mmAcquirer
 * CardPaymentEnvironment20.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#mmAcquirerIdentification
 * CardPaymentEnvironment30.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmAcquirer
 * CardPaymentEnvironment27.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmAcquirerIdentification
 * CardPaymentEnvironment28.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#mmAcquirerIdentification
 * CardPaymentEnvironment21.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#mmAcquirer
 * CardPaymentEnvironment26.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#mmAcquirer
 * CardPaymentEnvironment23.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmAcquirer
 * CardPaymentEnvironment22.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmAcquirer
 * CardPaymentEnvironment37.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#mmAcquirerIdentification
 * CardPaymentEnvironment33.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#mmAcquirer
 * CardPaymentEnvironment32.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#mmAcquirer
 * CardPaymentEnvironment36.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmAcquirer
 * CardPaymentEnvironment43.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#mmAcquirerIdentification
 * CardPaymentEnvironment41.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#mmAcquirer
 * CardPaymentEnvironment42.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmAcquirer
 * CardPaymentEnvironment40.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#mmAcquirerIdentification
 * CardPaymentEnvironment44.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmAcquirer
 * CardPaymentEnvironment34.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#mmAcquirer
 * CardPaymentEnvironment35.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmAcquirerIdentification
 * CardPaymentEnvironment38.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#mmAcquirer
 * CardPaymentEnvironment39.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#mmAcquirerIdentification
 * CardPaymentEnvironment46.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmAcquirer
 * CardPaymentEnvironment50.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#mmAcquirer
 * CardPaymentEnvironment52.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#mmAcquirer
 * CardPaymentEnvironment49.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#mmAcquirer
 * CardPaymentEnvironment51.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#mmAcquirer
 * CardPaymentEnvironment48.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#mmAcquirerIdentification
 * CardPaymentEnvironment56.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#mmAcquirer
 * CardPaymentEnvironment45.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmAcquirer
 * CardPaymentEnvironment55.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmAcquirerIdentification
 * CardPaymentEnvironment54.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmAcquirer
 * CardPaymentEnvironment53.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmAcquirer
 * CardPaymentEnvironment47.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmAcquirer
 * CardPaymentEnvironment61.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmAcquirer
 * CardPaymentEnvironment64.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmAcquirer
 * CardPaymentEnvironment60.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#mmAcquirerIdentification
 * CardPaymentEnvironment65.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmAcquirer
 * CardPaymentEnvironment67.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmAcquirerIdentification
 * CardPaymentEnvironment66.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmAcquirer
 * CardPaymentEnvironment62.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmAcquirerIdentification
 * CardPaymentEnvironment63.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#mmAcquirer
 * CardPaymentEnvironment58.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmAcquirer
 * CardPaymentEnvironment59.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmAcquirer
 * CardPaymentEnvironment57.mmAcquirer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
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
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerRole";
				definition = "Entity acquiring card payment transactions.";
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment5.mmAcquirer, CardPaymentEnvironment6.mmAcquirer, CardPaymentEnvironment13.mmAcquirer, CardPaymentEnvironment14.mmAcquirer,
						CardPaymentEnvironment3.mmAcquirer, CardPaymentEnvironment11.mmAcquirerIdentification, CardPaymentEnvironment16.mmAcquirerIdentification, CardPaymentEnvironment1.mmAcquirer, CardPaymentEnvironment9.mmAcquirer,
						CardPaymentEnvironment7.mmAcquirer, CardPaymentEnvironment15.mmAcquirer, CardPaymentEnvironment19.mmAcquirerIdentification, CardPaymentEnvironment4.mmAcquirer, CardPaymentEnvironment12.mmAcquirer,
						CardPaymentEnvironment2.mmAcquirer, CardPaymentEnvironment10.mmAcquirer, CardPaymentEnvironment18.mmAcquirer, CardPaymentEnvironment31.mmAcquirer, CardPaymentEnvironment29.mmAcquirer,
						CardPaymentEnvironment24.mmAcquirer, CardPaymentEnvironment25.mmAcquirer, CardPaymentEnvironment20.mmAcquirer, CardPaymentEnvironment30.mmAcquirerIdentification, CardPaymentEnvironment27.mmAcquirer,
						CardPaymentEnvironment28.mmAcquirerIdentification, CardPaymentEnvironment21.mmAcquirerIdentification, CardPaymentEnvironment26.mmAcquirer, CardPaymentEnvironment23.mmAcquirer, CardPaymentEnvironment22.mmAcquirer,
						CardPaymentEnvironment37.mmAcquirer, CardPaymentEnvironment33.mmAcquirerIdentification, CardPaymentEnvironment32.mmAcquirer, CardPaymentEnvironment36.mmAcquirer, CardPaymentEnvironment43.mmAcquirer,
						CardPaymentEnvironment41.mmAcquirerIdentification, CardPaymentEnvironment42.mmAcquirer, CardPaymentEnvironment40.mmAcquirer, CardPaymentEnvironment44.mmAcquirerIdentification, CardPaymentEnvironment34.mmAcquirer,
						CardPaymentEnvironment35.mmAcquirer, CardPaymentEnvironment38.mmAcquirerIdentification, CardPaymentEnvironment39.mmAcquirer, CardPaymentEnvironment46.mmAcquirerIdentification, CardPaymentEnvironment50.mmAcquirer,
						CardPaymentEnvironment52.mmAcquirer, CardPaymentEnvironment49.mmAcquirer, CardPaymentEnvironment51.mmAcquirer, CardPaymentEnvironment48.mmAcquirer, CardPaymentEnvironment56.mmAcquirerIdentification,
						CardPaymentEnvironment45.mmAcquirer, CardPaymentEnvironment55.mmAcquirer, CardPaymentEnvironment54.mmAcquirerIdentification, CardPaymentEnvironment53.mmAcquirer, CardPaymentEnvironment47.mmAcquirer,
						CardPaymentEnvironment61.mmAcquirer, CardPaymentEnvironment64.mmAcquirer, CardPaymentEnvironment60.mmAcquirer, CardPaymentEnvironment65.mmAcquirerIdentification, CardPaymentEnvironment67.mmAcquirer,
						CardPaymentEnvironment66.mmAcquirerIdentification, CardPaymentEnvironment62.mmAcquirer, CardPaymentEnvironment63.mmAcquirerIdentification, CardPaymentEnvironment58.mmAcquirer, CardPaymentEnvironment59.mmAcquirer,
						CardPaymentEnvironment57.mmAcquirer);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Acquirer1.mmObject(), Acquirer2.mmObject(), Acquirer3.mmObject(), Acquirer4.mmObject(), Acquirer6.mmObject(), Acquirer5.mmObject(), Acquirer7.mmObject(), Acquirer8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}