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
import com.tools20022.repository.codeset.AuthorityExchangeReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the exchange with the national competent authority.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForInstrument
 * AuthorityExchangeReason1Code.CompetentAuthorityForInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#AdHocRequest
 * AuthorityExchangeReason1Code.AdHocRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForBasketConstituent
 * AuthorityExchangeReason1Code.CompetentAuthorityForBasketConstituent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForBuyerBranch
 * AuthorityExchangeReason1Code.CompetentAuthorityForBuyerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForDecisionMakingBranch
 * AuthorityExchangeReason1Code.CompetentAuthorityForDecisionMakingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForDirectUnderlying
 * AuthorityExchangeReason1Code.CompetentAuthorityForDirectUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForExecutingBranch
 * AuthorityExchangeReason1Code.CompetentAuthorityForExecutingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForIndex
 * AuthorityExchangeReason1Code.CompetentAuthorityForIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForMembershipBranch
 * AuthorityExchangeReason1Code.CompetentAuthorityForMembershipBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForSellerBranch
 * AuthorityExchangeReason1Code.CompetentAuthorityForSellerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#CompetentAuthorityForTradingVenue
 * AuthorityExchangeReason1Code.CompetentAuthorityForTradingVenue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
 * AuthorityExchangeReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthorityExchangeReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the exchange with the national competent authority."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthorityExchangeReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForInstrument"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForInstrument = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdHocRequest"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code AdHocRequest = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdHocRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.AdHocRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBasketConstituent"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForBasketConstituent = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBasketConstituent";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForBasketConstituent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBuyerBranch"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForBuyerBranch = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBuyerBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForBuyerBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDecisionMakingBranch"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForDecisionMakingBranch = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDecisionMakingBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForDecisionMakingBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDirectUnderlying"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForDirectUnderlying = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDirectUnderlying";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForDirectUnderlying.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForExecutingBranch"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForExecutingBranch = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForExecutingBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForExecutingBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForIndex"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForIndex = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForIndex.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForMembershipBranch"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForMembershipBranch = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForMembershipBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForMembershipBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForSellerBranch"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForSellerBranch = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForSellerBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForSellerBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForTradingVenue"</li>
	 * </ul>
	 */
	public static final AuthorityExchangeReason1Code CompetentAuthorityForTradingVenue = new AuthorityExchangeReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForTradingVenue";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmObject();
			codeName = AuthorityExchangeReasonCode.CompetentAuthorityForTradingVenue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthorityExchangeReason1Code> codesByName = new LinkedHashMap<>();

	protected AuthorityExchangeReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorityExchangeReason1Code";
				definition = "Specifies the reason for the exchange with the national competent authority.";
				trace_lazy = () -> AuthorityExchangeReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForInstrument, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.AdHocRequest,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForBasketConstituent, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForBuyerBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForDecisionMakingBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForDirectUnderlying,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForExecutingBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForIndex,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForMembershipBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForSellerBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.CompetentAuthorityForTradingVenue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CompetentAuthorityForInstrument.getCodeName().get(), CompetentAuthorityForInstrument);
		codesByName.put(AdHocRequest.getCodeName().get(), AdHocRequest);
		codesByName.put(CompetentAuthorityForBasketConstituent.getCodeName().get(), CompetentAuthorityForBasketConstituent);
		codesByName.put(CompetentAuthorityForBuyerBranch.getCodeName().get(), CompetentAuthorityForBuyerBranch);
		codesByName.put(CompetentAuthorityForDecisionMakingBranch.getCodeName().get(), CompetentAuthorityForDecisionMakingBranch);
		codesByName.put(CompetentAuthorityForDirectUnderlying.getCodeName().get(), CompetentAuthorityForDirectUnderlying);
		codesByName.put(CompetentAuthorityForExecutingBranch.getCodeName().get(), CompetentAuthorityForExecutingBranch);
		codesByName.put(CompetentAuthorityForIndex.getCodeName().get(), CompetentAuthorityForIndex);
		codesByName.put(CompetentAuthorityForMembershipBranch.getCodeName().get(), CompetentAuthorityForMembershipBranch);
		codesByName.put(CompetentAuthorityForSellerBranch.getCodeName().get(), CompetentAuthorityForSellerBranch);
		codesByName.put(CompetentAuthorityForTradingVenue.getCodeName().get(), CompetentAuthorityForTradingVenue);
	}

	public static AuthorityExchangeReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthorityExchangeReason1Code[] values() {
		AuthorityExchangeReason1Code[] values = new AuthorityExchangeReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthorityExchangeReason1Code> {
		@Override
		public AuthorityExchangeReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthorityExchangeReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}