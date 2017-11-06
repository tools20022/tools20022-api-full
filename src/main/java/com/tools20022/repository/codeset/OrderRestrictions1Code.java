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
import com.tools20022.repository.codeset.OrderClassificationCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the classification and thus the restrictions associated with an
 * order (for regulatory purposes).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
 * OrderClassificationCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmProgramTrade
 * OrderRestrictions1Code.mmProgramTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmIndexArbitrage
 * OrderRestrictions1Code.mmIndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmNonIndexArbitrage
 * OrderRestrictions1Code.mmNonIndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmCompetingMarketMaker
 * OrderRestrictions1Code.mmCompetingMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmSpecialistInSecurity
 * OrderRestrictions1Code.mmSpecialistInSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmSpecialistInUnderlyingSecurity
 * OrderRestrictions1Code.mmSpecialistInUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmForeignEntity
 * OrderRestrictions1Code.mmForeignEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmExternalMarketParticipant
 * OrderRestrictions1Code.mmExternalMarketParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmExternalInterConnectedMarketLinkage
 * OrderRestrictions1Code.mmExternalInterConnectedMarketLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code#mmRisklessArbitrage
 * OrderRestrictions1Code.mmRisklessArbitrage}</li>
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
 * <li>"PROG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderRestrictions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes)."
 * </li>
 * </ul>
 */
public class OrderRestrictions1Code extends OrderClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmProgramTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgramTrade";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexArbitrage"</li>
	 * </ul>
	 */
	public static final MMCode mmIndexArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexArbitrage";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonIndexArbitrage"</li>
	 * </ul>
	 */
	public static final MMCode mmNonIndexArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonIndexArbitrage";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetingMarketMaker"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetingMarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetingMarketMaker";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInSecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialistInSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInSecurity";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialistInUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInUnderlyingSecurity";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignEntity"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignEntity";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalMarketParticipant"</li>
	 * </ul>
	 */
	public static final MMCode mmExternalMarketParticipant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalMarketParticipant";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalInterConnectedMarketLinkage"</li>
	 * </ul>
	 */
	public static final MMCode mmExternalInterConnectedMarketLinkage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalInterConnectedMarketLinkage";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessArbitrage"</li>
	 * </ul>
	 */
	public static final MMCode mmRisklessArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessArbitrage";
			owner_lazy = () -> OrderRestrictions1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("PROG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderRestrictions1Code";
				definition = "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderRestrictions1Code.mmProgramTrade, com.tools20022.repository.codeset.OrderRestrictions1Code.mmIndexArbitrage,
						com.tools20022.repository.codeset.OrderRestrictions1Code.mmNonIndexArbitrage, com.tools20022.repository.codeset.OrderRestrictions1Code.mmCompetingMarketMaker,
						com.tools20022.repository.codeset.OrderRestrictions1Code.mmSpecialistInSecurity, com.tools20022.repository.codeset.OrderRestrictions1Code.mmSpecialistInUnderlyingSecurity,
						com.tools20022.repository.codeset.OrderRestrictions1Code.mmForeignEntity, com.tools20022.repository.codeset.OrderRestrictions1Code.mmExternalMarketParticipant,
						com.tools20022.repository.codeset.OrderRestrictions1Code.mmExternalInterConnectedMarketLinkage, com.tools20022.repository.codeset.OrderRestrictions1Code.mmRisklessArbitrage);
				trace_lazy = () -> OrderClassificationCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}