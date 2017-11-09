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
import com.tools20022.repository.entity.ReceivingSettlementParty;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation holding securities to enable book entry transfer of securities.
 * These organisations may also carry out centralised comparison and transaction
 * processing such as clearing and settlement of securities. The physical
 * securities may be immobilised by the depository, or securities may be
 * dematerialised (so that they exist only as electronic records). Also
 * responsible for compliance of the portfolio with legal ratios etc. The
 * depository may delegate custody to another entity (custodian).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReceivingDepositoryRole"
 * src="doc-files/ReceivingDepositoryRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
 * ReceivingSettlementParty}</li>
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
 * "ReceivingDepositoryRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation holding securities to enable book entry transfer of securities. These organisations may also carry out centralised comparison and transaction processing such as clearing and settlement of securities. The physical securities may be immobilised by the depository, or securities may be dematerialised (so that they exist only as electronic records). Also responsible for compliance of the portfolio with legal ratios etc. The depository may delegate custody to another entity (custodian)."
 * </li>
 * </ul>
 */
public class ReceivingDepositoryRole extends ReceivingSettlementParty {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingDepositoryRole";
				definition = "Organisation holding securities to enable book entry transfer of securities. These organisations may also carry out centralised comparison and transaction processing such as clearing and settlement of securities. The physical securities may be immobilised by the depository, or securities may be dematerialised (so that they exist only as electronic records). Also responsible for compliance of the portfolio with legal ratios etc. The depository may delegate custody to another entity (custodian).";
				superType_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}