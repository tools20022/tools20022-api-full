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
import com.tools20022.repository.entity.SecurityCertificatePartyRole;
import com.tools20022.repository.msg.PartyAndCertificate2;
import com.tools20022.repository.msg.PartyAndCertificate3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Holder of the security certificate.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecurityCertificateHolderRole"
 * src="doc-files/SecurityCertificateHolderRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole
 * SecurityCertificatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate2
 * PartyAndCertificate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate3
 * PartyAndCertificate3}</li>
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
 * "SecurityCertificateHolderRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Holder of the security certificate."</li>
 * </ul>
 */
public class SecurityCertificateHolderRole extends SecurityCertificatePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecurityCertificateHolderRole";
				definition = "Holder of the security certificate.";
				superType_lazy = () -> SecurityCertificatePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyAndCertificate2.mmObject(), PartyAndCertificate3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}