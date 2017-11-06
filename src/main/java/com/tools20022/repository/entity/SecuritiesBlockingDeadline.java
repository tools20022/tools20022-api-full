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
import com.tools20022.repository.entity.Deadline;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Date by which the securities should be blocked.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesBlockingDeadline"
 * src="doc-files/SecuritiesBlockingDeadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline#mmBlockingPeriod
 * SecuritiesBlockingDeadline.mmBlockingPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
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
 * "SecuritiesBlockingDeadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Date by which the securities should be blocked."</li>
 * </ul>
 */
public class SecuritiesBlockingDeadline extends Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod blockingPeriod;
	/**
	 * Period during which the securities are blocked, ie, not available for
	 * exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline
	 * SecuritiesBlockingDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmBlockingPeriod
	 * CorporateActionPeriod3.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmBlockingPeriod
	 * CorporateActionPeriod6.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBlockingPeriod
	 * CorporateActionPeriod8.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmBlockingPeriod
	 * EligibilityDates.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmBlockingPeriod
	 * CorporateActionPeriod1.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBlockingPeriod
	 * CorporateActionPeriod10.mmBlockingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the securities are blocked, ie, not available for exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockingPeriod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.mmBlockingPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.mmBlockingPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.mmBlockingPeriod, com.tools20022.repository.msg.EligibilityDates.mmBlockingPeriod, com.tools20022.repository.msg.CorporateActionPeriod1.mmBlockingPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod10.mmBlockingPeriod);
			elementContext_lazy = () -> SecuritiesBlockingDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the securities are blocked, ie, not available for exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBlockingDeadline";
				definition = "Date by which the securities should be blocked.";
				superType_lazy = () -> Deadline.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBlockingDeadline.mmBlockingPeriod);
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getBlockingPeriod() {
		return blockingPeriod;
	}

	public void setBlockingPeriod(com.tools20022.repository.entity.DateTimePeriod blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
	}
}