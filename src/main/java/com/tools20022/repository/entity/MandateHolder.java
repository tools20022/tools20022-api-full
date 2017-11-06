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
import com.tools20022.repository.entity.MandatePartyRole;
import com.tools20022.repository.msg.PartyAndCertificate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that was given by another entity the authority to act on its behalf.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MandateHolder" src="doc-files/MandateHolder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmPowerOfAttorney
 * AccountParties2.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmPowerOfAttorney
 * AccountParties5.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmPowerOfAttorney
 * AccountParties6.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmPowerOfAttorney
 * AccountParties3.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmPowerOfAttorney
 * AccountParties4.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmPowerOfAttorney
 * AccountParties7.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmMandateHolder
 * OperationMandate2.mmMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmMandateHolder
 * OperationMandate3.mmMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmPowerOfAttorney
 * AccountParties9.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmPowerOfAttorney
 * AccountParties8.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#mmPowerOfAttorney
 * AccountParties11.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmPowerOfAttorney
 * AccountParties10.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#mmPowerOfAttorney
 * AccountParties12.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPowerOfAttorney
 * AccountParties13.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmPowerOfAttorney
 * AccountParties14.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPowerOfAttorney
 * AccountParties15.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmPowerOfAttorney
 * AccountParties16.mmPowerOfAttorney}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.MandatePartyRole
 * MandatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate1
 * PartyAndCertificate1}</li>
 * </ul>
 * </li>
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
 * "MandateHolder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that was given by another entity the authority to act on its behalf."
 * </li>
 * </ul>
 */
public class MandateHolder extends MandatePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateHolder";
				definition = "Entity that was given by another entity the authority to act on its behalf.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties5.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties6.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties3.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties4.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties7.mmPowerOfAttorney, com.tools20022.repository.msg.OperationMandate2.mmMandateHolder, com.tools20022.repository.msg.OperationMandate3.mmMandateHolder,
						com.tools20022.repository.msg.AccountParties9.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties8.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties11.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties10.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties12.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties13.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties14.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties15.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties16.mmPowerOfAttorney);
				superType_lazy = () -> MandatePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyAndCertificate1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}