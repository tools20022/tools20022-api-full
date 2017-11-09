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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BalanceTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the balance, eg, opening balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmOpeningBooked
 * BalanceType9Code.mmOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInterimBooked
 * BalanceType9Code.mmInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmClosingBooked
 * BalanceType9Code.mmClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmOpeningAvailable
 * BalanceType9Code.mmOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInterimAvailable
 * BalanceType9Code.mmInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmClosingAvailable
 * BalanceType9Code.mmClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmForwardAvailable
 * BalanceType9Code.mmForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmPreviouslyClosedBooked
 * BalanceType9Code.mmPreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentOpeningAvailable
 * BalanceType9Code.mmInvestmentOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentInterimAvailable
 * BalanceType9Code.mmInvestmentInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentClosingAvailable
 * BalanceType9Code.mmInvestmentClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentForwardAvailable
 * BalanceType9Code.mmInvestmentForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentClosingBooked
 * BalanceType9Code.mmInvestmentClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentInterimBooked
 * BalanceType9Code.mmInvestmentInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmInvestmentOpeningBooked
 * BalanceType9Code.mmInvestmentOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementOpeningAvailable
 * BalanceType9Code.mmDisbursementOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementInterimAvailable
 * BalanceType9Code.mmDisbursementInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementClosingAvailable
 * BalanceType9Code.mmDisbursementClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementForwardAvailable
 * BalanceType9Code.mmDisbursementForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementClosingBooked
 * BalanceType9Code.mmDisbursementClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementInterimBooked
 * BalanceType9Code.mmDisbursementInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmDisbursementOpeningBooked
 * BalanceType9Code.mmDisbursementOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionOpeningAvailable
 * BalanceType9Code.mmCollectionOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionInterimAvailable
 * BalanceType9Code.mmCollectionInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionClosingAvailable
 * BalanceType9Code.mmCollectionClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionForwardAvailable
 * BalanceType9Code.mmCollectionForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionClosingBooked
 * BalanceType9Code.mmCollectionClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionInterimBooked
 * BalanceType9Code.mmCollectionInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code#mmCollectionOpeningBooked
 * BalanceType9Code.mmCollectionOpeningBooked}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the balance, eg, opening balance."</li>
 * </ul>
 */
public class BalanceType9Code extends BalanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyClosedBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmPreviouslyClosedBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyClosedBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentOpeningAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentInterimAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentClosingAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentForwardAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentForwardAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentClosingBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentInterimBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentOpeningBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementOpeningAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementInterimAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementClosingAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementForwardAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementForwardAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementClosingBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementInterimBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmDisbursementOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementOpeningBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionOpeningAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionOpeningAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionInterimAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionInterimAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionClosingAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionClosingAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionForwardAvailable"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionForwardAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionForwardAvailable";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionClosingBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionClosingBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionInterimBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionInterimBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType9Code
	 * BalanceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningBooked"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionOpeningBooked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionOpeningBooked";
			owner_lazy = () -> BalanceType9Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceType9Code";
				definition = "Specifies the nature of the balance, eg, opening balance.";
				code_lazy = () -> Arrays.asList(BalanceType9Code.mmOpeningBooked, BalanceType9Code.mmInterimBooked, BalanceType9Code.mmClosingBooked, BalanceType9Code.mmOpeningAvailable, BalanceType9Code.mmInterimAvailable,
						BalanceType9Code.mmClosingAvailable, BalanceType9Code.mmForwardAvailable, BalanceType9Code.mmPreviouslyClosedBooked, BalanceType9Code.mmInvestmentOpeningAvailable, BalanceType9Code.mmInvestmentInterimAvailable,
						BalanceType9Code.mmInvestmentClosingAvailable, BalanceType9Code.mmInvestmentForwardAvailable, BalanceType9Code.mmInvestmentClosingBooked, BalanceType9Code.mmInvestmentInterimBooked,
						BalanceType9Code.mmInvestmentOpeningBooked, BalanceType9Code.mmDisbursementOpeningAvailable, BalanceType9Code.mmDisbursementInterimAvailable, BalanceType9Code.mmDisbursementClosingAvailable,
						BalanceType9Code.mmDisbursementForwardAvailable, BalanceType9Code.mmDisbursementClosingBooked, BalanceType9Code.mmDisbursementInterimBooked, BalanceType9Code.mmDisbursementOpeningBooked,
						BalanceType9Code.mmCollectionOpeningAvailable, BalanceType9Code.mmCollectionInterimAvailable, BalanceType9Code.mmCollectionClosingAvailable, BalanceType9Code.mmCollectionForwardAvailable,
						BalanceType9Code.mmCollectionClosingBooked, BalanceType9Code.mmCollectionInterimBooked, BalanceType9Code.mmCollectionOpeningBooked);
				trace_lazy = () -> BalanceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}