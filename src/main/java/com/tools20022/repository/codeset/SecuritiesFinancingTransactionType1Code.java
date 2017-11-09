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
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
 * SecuritiesTransactionTypeV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#mmRepo
 * SecuritiesFinancingTransactionType1Code.mmRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#mmReverseRepo
 * SecuritiesFinancingTransactionType1Code.mmReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#mmSecuritiesBorrowing
 * SecuritiesFinancingTransactionType1Code.mmSecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code#mmSecuritiesLending
 * SecuritiesFinancingTransactionType1Code.mmSecuritiesLending}</li>
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
 * <li>"REPU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
 * SecuritiesFinancingTransactionType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SecuritiesFinancingTransactionType1Code extends SecuritiesTransactionTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#mmRepo
	 * SecuritiesFinancingTransactionType2Code.mmRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType2Code.mmRepo);
			owner_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#mmReverseRepo
	 * SecuritiesFinancingTransactionType2Code.mmReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReverseRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType2Code.mmReverseRepo);
			owner_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#mmSecuritiesBorrowing
	 * SecuritiesFinancingTransactionType2Code.mmSecuritiesBorrowing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesBorrowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType2Code.mmSecuritiesBorrowing);
			owner_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code#mmSecuritiesLending
	 * SecuritiesFinancingTransactionType2Code.mmSecuritiesLending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesLending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType2Code.mmSecuritiesLending);
			owner_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REPU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingTransactionType1Code";
				definition = "Specifies the type of securities financing transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType2Code.mmObject());
				code_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionType1Code.mmRepo, SecuritiesFinancingTransactionType1Code.mmReverseRepo, SecuritiesFinancingTransactionType1Code.mmSecuritiesBorrowing,
						SecuritiesFinancingTransactionType1Code.mmSecuritiesLending);
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}