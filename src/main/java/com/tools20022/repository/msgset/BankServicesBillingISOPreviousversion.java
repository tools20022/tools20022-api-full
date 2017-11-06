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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.camt.BankServicesBillingStatementV01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A message that provides a standard means for banks to periodically advise
 * their wholesale clients or correspondent banks bank service fees, taxes and
 * average balances. Electronic in form, the Bank Services Billing (BSB) is
 * designed to augment or replace the corresponding paper billing statement or
 * to introduce a billing statement if there is no paper statement available. <br>
 * <br>
 * BSB is intended to be equally relevant for use regardless of where bank
 * accounts reside. By design BSB is intended to cover the EU, Singapore, USA,
 * and other countries. It needs to be recognized however that bank billing and
 * related market practice is complex and diverse across multiple geographies.
 * It is possible that revisions to the standard will be required to accommodate
 * market practice (or changes to practice) not accommodated by the standard at
 * the time of its creation. A maintenance process will be available to address
 * future revisions to the standard which may be required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01
 * BankServicesBillingStatementV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Bank Services Billing - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A message that provides a standard means for banks to periodically advise their wholesale clients or correspondent banks bank service fees, taxes and average balances.  Electronic in form, the Bank Services Billing (BSB) is designed to augment or replace the corresponding paper billing statement or to introduce a billing statement if there is no paper statement available.  \r\n\r\nBSB is intended to be equally relevant for use regardless of where bank accounts reside.  By design BSB is intended to cover the EU, Singapore, USA, and other countries. It needs to be recognized however that bank billing and related market practice is complex and diverse across multiple geographies. It is possible that revisions to the standard will be required to accommodate market practice (or changes to practice) not accommodated by the standard at the time of its creation. A maintenance process will be available to address future revisions to the standard which may be required."
 * </li>
 * </ul>
 */
public class BankServicesBillingISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bank Services Billing - ISO - Previous version";
				definition = "A message that provides a standard means for banks to periodically advise their wholesale clients or correspondent banks bank service fees, taxes and average balances.  Electronic in form, the Bank Services Billing (BSB) is designed to augment or replace the corresponding paper billing statement or to introduce a billing statement if there is no paper statement available.  \r\n\r\nBSB is intended to be equally relevant for use regardless of where bank accounts reside.  By design BSB is intended to cover the EU, Singapore, USA, and other countries. It needs to be recognized however that bank billing and related market practice is complex and diverse across multiple geographies. It is possible that revisions to the standard will be required to accommodate market practice (or changes to practice) not accommodated by the standard at the time of its creation. A maintenance process will be available to address future revisions to the standard which may be required.";
				messageDefinition_lazy = () -> Arrays.asList(BankServicesBillingStatementV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}