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
import com.tools20022.repository.codeset.QuoteStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the status of a quote acknowledgement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Accepted
 * QuoteStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CancelSymbol
 * QuoteStatus1Code.CancelSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CancelSecurity
 * QuoteStatus1Code.CancelSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CancelUnderlying
 * QuoteStatus1Code.CancelUnderlying}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CancelAll
 * QuoteStatus1Code.CancelAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Rejected
 * QuoteStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#RemovedFromMarket
 * QuoteStatus1Code.RemovedFromMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Expired
 * QuoteStatus1Code.Expired}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Query
 * QuoteStatus1Code.Query}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#QuoteNotFound
 * QuoteStatus1Code.QuoteNotFound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Pending
 * QuoteStatus1Code.Pending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#Pass
 * QuoteStatus1Code.Pass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#LockedMarketWarning
 * QuoteStatus1Code.LockedMarketWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CrossMarketWarning
 * QuoteStatus1Code.CrossMarketWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CanceledDueToLockMarket
 * QuoteStatus1Code.CanceledDueToLockMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code#CanceledDueToCrossMarket
 * QuoteStatus1Code.CanceledDueToCrossMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
 * QuoteStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of a quote acknowledgement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Accepted = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSymbol"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CancelSymbol = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CancelSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSecurity"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CancelSecurity = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CancelSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlying"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CancelUnderlying = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlying";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CancelUnderlying.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelAll"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CancelAll = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelAll";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CancelAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Rejected = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovedFromMarket"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code RemovedFromMarket = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovedFromMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.RemovedFromMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Expired = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Query"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Query = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Query";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Query.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteNotFound"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code QuoteNotFound = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.QuoteNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Pending = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code Pass = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.Pass.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockedMarketWarning"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code LockedMarketWarning = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockedMarketWarning";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.LockedMarketWarning.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossMarketWarning"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CrossMarketWarning = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossMarketWarning";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CrossMarketWarning.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanceledDueToLockMarket"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CanceledDueToLockMarket = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToLockMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CanceledDueToLockMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanceledDueToCrossMarket"</li>
	 * </ul>
	 */
	public static final QuoteStatus1Code CanceledDueToCrossMarket = new QuoteStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToCrossMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus1Code.mmObject();
			codeName = QuoteStatusCode.CanceledDueToCrossMarket.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QuoteStatus1Code> codesByName = new LinkedHashMap<>();

	protected QuoteStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteStatus1Code";
				definition = "Identifies the status of a quote acknowledgement.";
				trace_lazy = () -> QuoteStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteStatus1Code.Accepted, com.tools20022.repository.codeset.QuoteStatus1Code.CancelSymbol,
						com.tools20022.repository.codeset.QuoteStatus1Code.CancelSecurity, com.tools20022.repository.codeset.QuoteStatus1Code.CancelUnderlying, com.tools20022.repository.codeset.QuoteStatus1Code.CancelAll,
						com.tools20022.repository.codeset.QuoteStatus1Code.Rejected, com.tools20022.repository.codeset.QuoteStatus1Code.RemovedFromMarket, com.tools20022.repository.codeset.QuoteStatus1Code.Expired,
						com.tools20022.repository.codeset.QuoteStatus1Code.Query, com.tools20022.repository.codeset.QuoteStatus1Code.QuoteNotFound, com.tools20022.repository.codeset.QuoteStatus1Code.Pending,
						com.tools20022.repository.codeset.QuoteStatus1Code.Pass, com.tools20022.repository.codeset.QuoteStatus1Code.LockedMarketWarning, com.tools20022.repository.codeset.QuoteStatus1Code.CrossMarketWarning,
						com.tools20022.repository.codeset.QuoteStatus1Code.CanceledDueToLockMarket, com.tools20022.repository.codeset.QuoteStatus1Code.CanceledDueToCrossMarket);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(CancelSymbol.getCodeName().get(), CancelSymbol);
		codesByName.put(CancelSecurity.getCodeName().get(), CancelSecurity);
		codesByName.put(CancelUnderlying.getCodeName().get(), CancelUnderlying);
		codesByName.put(CancelAll.getCodeName().get(), CancelAll);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(RemovedFromMarket.getCodeName().get(), RemovedFromMarket);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Query.getCodeName().get(), Query);
		codesByName.put(QuoteNotFound.getCodeName().get(), QuoteNotFound);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Pass.getCodeName().get(), Pass);
		codesByName.put(LockedMarketWarning.getCodeName().get(), LockedMarketWarning);
		codesByName.put(CrossMarketWarning.getCodeName().get(), CrossMarketWarning);
		codesByName.put(CanceledDueToLockMarket.getCodeName().get(), CanceledDueToLockMarket);
		codesByName.put(CanceledDueToCrossMarket.getCodeName().get(), CanceledDueToCrossMarket);
	}

	public static QuoteStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteStatus1Code[] values() {
		QuoteStatus1Code[] values = new QuoteStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteStatus1Code> {
		@Override
		public QuoteStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}