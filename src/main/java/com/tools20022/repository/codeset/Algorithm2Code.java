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
import com.tools20022.repository.codeset.AlgorithmCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cryptographic algorithms for the protection of transported keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmAES128CBC
 * Algorithm2Code.mmAES128CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmDES112CBC
 * Algorithm2Code.mmDES112CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmDUKPT
 * Algorithm2Code.mmDUKPT}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmDUKPT2009
 * Algorithm2Code.mmDUKPT2009}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmUKPT
 * Algorithm2Code.mmUKPT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code#mmUKPTwithAES128
 * Algorithm2Code.mmUKPTwithAES128}</li>
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
 * <li>"EA2C"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for the protection of transported keys."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm9Code
 * Algorithm9Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Algorithm2Code extends AlgorithmCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CBC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#mmAES128CBC
	 * Algorithm9Code.mmAES128CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAES128CBC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmAES128CBC);
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CBC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#mmDES112CBC
	 * Algorithm9Code.mmDES112CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDES112CBC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmDES112CBC);
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT"</li>
	 * </ul>
	 */
	public static final MMCode mmDUKPT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT";
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#mmDUKPT2009
	 * Algorithm9Code.mmDUKPT2009}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDUKPT2009 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT2009";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmDUKPT2009);
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm9Code#mmUKPT
	 * Algorithm9Code.mmUKPT}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUKPT = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPT";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmUKPT);
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPTwithAES128"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#mmUKPTwithAES128
	 * Algorithm9Code.mmUKPTwithAES128}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUKPTwithAES128 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPTwithAES128";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmUKPTwithAES128);
			owner_lazy = () -> Algorithm2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EA2C");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm2Code";
				definition = "Cryptographic algorithms for the protection of transported keys.";
				nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmObject());
				code_lazy = () -> Arrays.asList(Algorithm2Code.mmAES128CBC, Algorithm2Code.mmDES112CBC, Algorithm2Code.mmDUKPT, Algorithm2Code.mmDUKPT2009, Algorithm2Code.mmUKPT, Algorithm2Code.mmUKPTwithAES128);
				trace_lazy = () -> AlgorithmCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}