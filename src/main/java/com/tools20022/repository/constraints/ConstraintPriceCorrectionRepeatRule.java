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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.PriceReportCorrectionV02;
import com.tools20022.repository.area.reda.PriceReportCorrectionV03;

/**
 * All information that was sent in a Price Report message should be repeated in
 * the Price Report Correction message. Only price information that has been
 * corrected should be quoted in CorrectedPriceDetails.
 */
public class ConstraintPriceCorrectionRepeatRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02
	 * PriceReportCorrectionV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionRepeatRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All information that was sent in a Price Report message should be repeated in the Price Report Correction message. Only price information that has been corrected should be quoted in CorrectedPriceDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceReportCorrectionV02> for_reda_PriceReportCorrectionV02 = new MMConstraint<PriceReportCorrectionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionRepeatRule";
			definition = "All information that was sent in a Price Report message should be repeated in the Price Report Correction message. Only price information that has been corrected should be quoted in CorrectedPriceDetails.";
			owner_lazy = () -> PriceReportCorrectionV02.mmObject();
		}

		@Override
		public void executeValidator(PriceReportCorrectionV02 obj) throws Exception {
			check_reda_PriceReportCorrectionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03
	 * PriceReportCorrectionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionRepeatRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All information that was sent in a Price Report message should be repeated in the Price Report Correction message. Only price information that has been corrected should be quoted in CorrectedPriceDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceReportCorrectionV03> for_reda_PriceReportCorrectionV03 = new MMConstraint<PriceReportCorrectionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionRepeatRule";
			definition = "All information that was sent in a Price Report message should be repeated in the Price Report Correction message. Only price information that has been corrected should be quoted in CorrectedPriceDetails.";
			owner_lazy = () -> PriceReportCorrectionV03.mmObject();
		}

		@Override
		public void executeValidator(PriceReportCorrectionV03 obj) throws Exception {
			check_reda_PriceReportCorrectionV03(obj);
		}
	};

	/**
	 * All information that was sent in a Price Report message should be
	 * repeated in the Price Report Correction message. Only price information
	 * that has been corrected should be quoted in CorrectedPriceDetails.
	 */
	public static void check_reda_PriceReportCorrectionV02(PriceReportCorrectionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All information that was sent in a Price Report message should be
	 * repeated in the Price Report Correction message. Only price information
	 * that has been corrected should be quoted in CorrectedPriceDetails.
	 */
	public static void check_reda_PriceReportCorrectionV03(PriceReportCorrectionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}