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
import com.tools20022.repository.codeset.DTCCPayoutTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout
 * types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
 * DTCCPayoutTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmCapitalGains
 * DTCCPayoutType3Code.mmCapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmCash
 * DTCCPayoutType3Code.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmDividend
 * DTCCPayoutType3Code.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmInterest
 * DTCCPayoutType3Code.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmLongTermCapitalGains
 * DTCCPayoutType3Code.mmLongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmPremium
 * DTCCPayoutType3Code.mmPremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmPrincipal
 * DTCCPayoutType3Code.mmPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmReturnOfCapital
 * DTCCPayoutType3Code.mmReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code#mmShortTermCapitalGains
 * DTCCPayoutType3Code.mmShortTermCapitalGains}</li>
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
 * "DTCCPayoutType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code
 * DTCCPayoutType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DTCCPayoutType3Code extends DTCCPayoutTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmCapitalGains
	 * DTCCPayoutType5Code.mmCapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmCapitalGains);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmCash
	 * DTCCPayoutType5Code.mmCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmCash);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmDividend
	 * DTCCPayoutType5Code.mmDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmDividend);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmInterest
	 * DTCCPayoutType5Code.mmInterest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmInterest);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmLongTermCapitalGains
	 * DTCCPayoutType5Code.mmLongTermCapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLongTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmLongTermCapitalGains);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmPremium
	 * DTCCPayoutType5Code.mmPremium}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmPremium);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmPrincipal
	 * DTCCPayoutType5Code.mmPrincipal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrincipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmPrincipal);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmReturnOfCapital
	 * DTCCPayoutType5Code.mmReturnOfCapital}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReturnOfCapital = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmReturnOfCapital);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code#mmShortTermCapitalGains
	 * DTCCPayoutType5Code.mmShortTermCapitalGains}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmShortTermCapitalGains);
			owner_lazy = () -> DTCCPayoutType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCPayoutType3Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types.";
				nextVersions_lazy = () -> Arrays.asList(DTCCPayoutType5Code.mmObject());
				code_lazy = () -> Arrays.asList(DTCCPayoutType3Code.mmCapitalGains, DTCCPayoutType3Code.mmCash, DTCCPayoutType3Code.mmDividend, DTCCPayoutType3Code.mmInterest, DTCCPayoutType3Code.mmLongTermCapitalGains,
						DTCCPayoutType3Code.mmPremium, DTCCPayoutType3Code.mmPrincipal, DTCCPayoutType3Code.mmReturnOfCapital, DTCCPayoutType3Code.mmShortTermCapitalGains);
				trace_lazy = () -> DTCCPayoutTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}