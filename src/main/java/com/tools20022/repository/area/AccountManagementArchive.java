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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the management of account related activities, such as
 * the opening and maintenance of an account
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "acmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02
 * AccountDetailsConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03
 * AccountDetailsConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02
 * AccountManagementStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03
 * AccountManagementStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02
 * AccountModificationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03
 * AccountModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02
 * AccountOpeningInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03
 * AccountOpeningInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV02
 * RequestForAccountManagementStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04
 * AccountDetailsConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04
 * AccountModificationInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04
 * AccountOpeningInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04
 * AccountManagementStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05
 * AccountOpeningInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05
 * AccountModificationInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03
 * RequestForAccountManagementStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
 * AccountDetailsConfirmationV05}</li>
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
 * "Account Management - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the management of account related activities, such as the opening and maintenance of an account"
 * </li>
 * </ul>
 */
public class AccountManagementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Account Management - Archive - master";
				definition = "Messages that support the management of account related activities, such as the opening and maintenance of an account";
				messageDefinition_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmObject(), AccountDetailsConfirmationV03.mmObject(), AccountManagementStatusReportV02.mmObject(), AccountManagementStatusReportV03.mmObject(),
						AccountModificationInstructionV02.mmObject(), AccountModificationInstructionV03.mmObject(), AccountOpeningInstructionV02.mmObject(), AccountOpeningInstructionV03.mmObject(),
						RequestForAccountManagementStatusReportV02.mmObject(), AccountDetailsConfirmationV04.mmObject(), AccountModificationInstructionV04.mmObject(), AccountOpeningInstructionV04.mmObject(),
						AccountManagementStatusReportV04.mmObject(), AccountOpeningInstructionV05.mmObject(), AccountModificationInstructionV05.mmObject(), RequestForAccountManagementStatusReportV03.mmObject(),
						AccountDetailsConfirmationV05.mmObject());
				code = "acmt";
			}
		});
		return mmObject_lazy.get();
	}
}