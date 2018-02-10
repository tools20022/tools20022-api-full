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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages exchanged between executing broker, Central Matching Utility
 * (CMU), investment manager and trustee, to submit trade confirmation details
 * for matching or affirmation. The messages support the cancellation of
 * previously sent trade confirmation messagse and the advice of the status of
 * the confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01
 * SecuritiesTradeConfirmationCancellationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01
 * SecuritiesTradeConfirmationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01
 * SecuritiesEndOfProcessReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03
 * SecuritiesTradeConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02
 * SecuritiesTradeConfirmationStatusAdviceV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Post Trade Matching - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages exchanged between executing broker, Central Matching Utility (CMU), investment manager and trustee, to submit trade confirmation details for matching or affirmation. The messages support the cancellation of previously sent trade confirmation messagse and the advice of the status of the confirmation."
 * </li>
 * </ul>
 */
public class PostTradeMatchingISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Post Trade Matching - ISO - Latest version";
				definition = "Set of messages exchanged between executing broker, Central Matching Utility (CMU), investment manager and trustee, to submit trade confirmation details for matching or affirmation. The messages support the cancellation of previously sent trade confirmation messagse and the advice of the status of the confirmation.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationCancellationV01.mmObject(), SecuritiesTradeConfirmationResponseV01.mmObject(), SecuritiesEndOfProcessReportV01.mmObject(),
						SecuritiesTradeConfirmationV03.mmObject(), SecuritiesTradeConfirmationStatusAdviceV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}