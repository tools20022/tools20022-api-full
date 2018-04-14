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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.trea.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support treasury operations (obsolete business area, to be
 * progressively replaced by business areas of the Foreign Exchange and Bank
 * Loan/Deposit business domains).<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "trea"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.trea.StatusNotificationV02
 * StatusNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.WithdrawalNotificationV01
 * WithdrawalNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02
 * CreateNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02
 * AmendNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02
 * CancelNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02
 * CreateNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02
 * AmendNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02
 * CancelNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02
 * NonDeliverableForwardNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02
 * CreateForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02
 * AmendForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02
 * CancelForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02
 * ForeignExchangeOptionNotificationV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Treasury - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support treasury operations (obsolete business area, to be progressively replaced by business areas of the Foreign Exchange and Bank Loan/Deposit business domains).\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class TreasuryArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Treasury - Archive - master";
				definition = "Messages that support treasury operations (obsolete business area, to be progressively replaced by business areas of the Foreign Exchange and Bank Loan/Deposit business domains).\r\n";
				code = "trea";
				messageDefinition_lazy = () -> Arrays.asList(StatusNotificationV02.mmObject(), WithdrawalNotificationV01.mmObject(), CreateNonDeliverableForwardOpeningV02.mmObject(), AmendNonDeliverableForwardOpeningV02.mmObject(),
						CancelNonDeliverableForwardOpeningV02.mmObject(), CreateNonDeliverableForwardValuationV02.mmObject(), AmendNonDeliverableForwardValuationV02.mmObject(), CancelNonDeliverableForwardValuationV02.mmObject(),
						NonDeliverableForwardNotificationV02.mmObject(), CreateForeignExchangeOptionV02.mmObject(), AmendForeignExchangeOptionV02.mmObject(), CancelForeignExchangeOptionV02.mmObject(),
						ForeignExchangeOptionNotificationV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}